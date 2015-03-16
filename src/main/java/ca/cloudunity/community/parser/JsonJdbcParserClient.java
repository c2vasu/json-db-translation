package ca.cloudunity.community.parser;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.mysql.jdbc.Statement;

import ca.store.product.dto.InputOutputEntityListDTO;
import ca.store.product.entity.Product;
import ca.store.product.entity.list.EntityList;

public class JsonJdbcParserClient {

	static final String WRITE_OBJECT_SQL = "INSERT INTO Entity_List_JSON_CU(serviceUrl,rows,sort,start,tag,view,entity_list_json) VALUES (?, ?, ?, ?, ?, ?, ?)";
	static final String READ_OBJECT_SQL = "SELECT object_value FROM java_objects WHERE id = ?";
	static final String ROWS = "rows";
	static final String SORT = "sort";
	static final String START = "start";
	static final String TAG = "tag";
	static final String VIEW = "view";
	static final String UTF8 = "UTF-8";
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/dev_cloud_unity";
	static final String USERNAME = "dev_user";
	static final String PASSWORD = "admin";
	
public static void main(String[] args) {
		
		InputOutputEntityListDTO pojo = new InputOutputEntityListDTO();
		
		System.out.println("===================Start==================");

		for(int index =0; index<=7;index++){
			String startValue = Integer.toString(index*9);
			System.out.println("index :"+index + " startValue :"+startValue);
			//to increment by multiple of 9
			pojo.setStart(startValue);
			//same value to be passed
			pojo.setServiceUrl("http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products");
			pojo.setStart(startValue);
			pojo.setSort("lastModified");
			pojo.setTag("lclonline/Product_Category/Bakery");
			pojo.setRows("9");
			pojo.setView("grid");
			String response = getEntityList(pojo);
			System.out.println(response);
		}
		System.out.println("===================End==================");
	}
	public static String getEntityList(InputOutputEntityListDTO pojo) {
		
		StringBuilder responseStrBuilder=new StringBuilder();
		HttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost(pojo.getServiceUrl());
		
		List<NameValuePair> params = new ArrayList<NameValuePair>(5);	 
		params.add(new BasicNameValuePair(ROWS, pojo.getRows()));
		params.add(new BasicNameValuePair(SORT, pojo.getSort()));
		params.add(new BasicNameValuePair(START, pojo.getStart()));
		params.add(new BasicNameValuePair(TAG, pojo.getTag()));
		params.add(new BasicNameValuePair(VIEW, pojo.getView()));
	
		HttpResponse response;
		try {
			httppost.setEntity(new UrlEncodedFormEntity(params, UTF8));
			response = httpclient.execute(httppost);
			// Post operation using above parameters
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				InputStream instream = entity.getContent();
	
				BufferedReader streamReader = new BufferedReader(new InputStreamReader(instream, UTF8)); 
				responseStrBuilder = new StringBuilder();
	
				String inputStr;
				while ((inputStr = streamReader.readLine()) != null){
					responseStrBuilder.append(inputStr);
				}
				// convert JSON string to Java object (Jackson)
				//TODO : To translate to individual POJO
				/*ObjectMapper mapper = new ObjectMapper();
				EntityList entityListObj = mapper.readValue(responseStrBuilder.toString(), EntityList.class);
				System.out.println("entityListObj :"+entityListObj);*/
				
				// persist the java objects using ORM (Hibernate + Spring Data JPS)
				Connection conn = null;
			    try {
			      conn = getConnection();
			      System.out.println("conn=" + conn);
			      conn.setAutoCommit(false);
			      
			      pojo.setJsonResponse(responseStrBuilder.toString());
			      long objectID = writeJavaObject(conn, pojo);
			      conn.commit();
			      System.out.println("Serialized objectID => " + objectID);
			      //List listFromDatabase = (List) readJavaObject(conn, objectID);
			      //System.out.println("[After De-Serialization] list=" + listFromDatabase);
			    } catch (Exception e) {
			      e.printStackTrace();
			    } finally {
				      try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			    }
			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(responseStrBuilder!=null){
			return responseStrBuilder.toString();
		}
		return "Empty";
	}
	
	public static Connection getConnection() throws Exception {
	    Class.forName(DRIVER);
	    Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
	    return conn;
	  }

	  public static long writeJavaObject(Connection conn, InputOutputEntityListDTO pojo) throws Exception {
	    PreparedStatement pstmt = conn.prepareStatement(WRITE_OBJECT_SQL, Statement.RETURN_GENERATED_KEYS);

	    // set input parameters
	    pstmt.setString(1, pojo.getServiceUrl());
	    pstmt.setString(2, pojo.getRows());
	    pstmt.setString(3, pojo.getSort());
	    pstmt.setString(4, pojo.getStart());
	    pstmt.setString(5, pojo.getTag());
	    pstmt.setObject(6, pojo.getView());
	    pstmt.setObject(7, pojo.getJsonResponse());
	    pstmt.executeUpdate();

	    // get the generated key for the id
	    ResultSet rs = pstmt.getGeneratedKeys();
	    int id = -1;
	    if (rs.next()) {
	      id = rs.getInt(1);
	    }

	    rs.close();
	    pstmt.close();
	    System.out.println("writeJavaObject: done serializing: " + pojo.getClass().getName());
	    return id;
	  }

	  public static Object readJavaObject(Connection conn, long id) throws Exception {
	    PreparedStatement pstmt = conn.prepareStatement(READ_OBJECT_SQL);
	    pstmt.setLong(1, id);
	    ResultSet rs = pstmt.executeQuery();
	    rs.next();
	    Object object = rs.getObject(1);
	    String className = object.getClass().getName();

	    rs.close();
	    pstmt.close();
	    System.out.println("readJavaObject: done de-serializing: " + className);
	    return object;
	  }
}
