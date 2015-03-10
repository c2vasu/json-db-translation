package ca.store.product.dto;


/**
 * @author SrinivasaRao
 * This is request DTO based on the provided inputs will fetch the response as JSON.
 */
public class RequestDTO {
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
}
