package ca.store.product.dto;

/**
 * Mapped to table Entity_List_JSON_CU
 * @author SrinivasaRao
 *
 */
public class InputOutputEntityListDTO {
	
	//e.g. http://www.nofrills.ca/banners/content/v1/listing/en_CA/nofrills/products
	private String serviceUrl;
	//e.g start:18
	private String start;
	//e.g rows:9
	private String rows;
	//e.g sort:lastModified
	private String sort;
	//e.g view:grid
	private String view;
	//e.g tag:lclonline/Product_Category/Grocery
	private String tag;
	//e.g Json response from source
	private String jsonResponse;
	
	public String getServiceUrl() {
		return serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getJsonResponse() {
		return jsonResponse;
	}
	public void setJsonResponse(String jsonResponse) {
		this.jsonResponse = jsonResponse;
	}
}
