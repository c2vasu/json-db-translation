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
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mysql.jdbc.Statement;

import ca.cloudunity.community.utility.HibernateUtil;
import ca.store.product.dto.InputOutputEntityListDTO;
import ca.store.product.entity.list.EntityList;

public class JsonHibernateParserClient {
	
	static final String ROWS = "rows";
	static final String SORT = "sort";
	static final String START = "start";
	static final String TAG = "tag";
	static final String VIEW = "view";
	static final String UTF8 = "UTF-8";
	
	public static void main(String[] args) {
		
		InputOutputEntityListDTO pojo = new InputOutputEntityListDTO();
		
		System.out.println("===================Start==================");

		for(int index =0; index<=60;index++){
			String startValue = Integer.toString(index*9);
			//System.out.println("index :"+index + " startValue :"+startValue);
			//to increment by multiple of 9
			//pojo.setStart(startValue);
			//same value to be passed
			pojo.setServiceUrl("http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products");
			pojo.setStart(Integer.toString(index));
			pojo.setSort("lastModified");
			pojo.setTag("lclonline/Product_Category/Bakery");
			pojo.setRows("1");
			pojo.setView("grid");
			String response = getEntityList(pojo);
			//System.out.println(response);
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
							
			    try {
			    	// convert JSON string to Java object (Jackson)
					ObjectMapper mapper = new ObjectMapper();
					EntityList entityListObj = mapper.readValue(responseStrBuilder.toString(), EntityList.class);
					System.out.println("entityListObj :"+entityListObj);
					// JSON response
					// pojo.setJsonResponse(responseStrBuilder.toString());
					// To Hibernate pojo
					String status = writeJavaObject(entityListObj);

			    } catch (Exception e) {
			      e.printStackTrace();
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


	  public static String writeJavaObject(EntityList pojo) throws Exception {
		  String status = "failed";
		  try {
			  //System.out.println("Begin");
			  Session session = HibernateUtil.getSessionFactory().openSession();
			  session.beginTransaction();
			  session.save(pojo);
			  session.getTransaction().commit();
			  //System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//HibernateUtil.shutdown();
	    }
		  
		  return status;
	  }

}
