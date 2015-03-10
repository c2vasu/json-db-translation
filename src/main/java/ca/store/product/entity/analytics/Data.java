package ca.store.product.entity.analytics;

public class Data {

private String province;

private String pageURL;

public String getProvince ()
{
    return province;
}

public void setProvince (String province)
{
    this.province = province;
}

public String getPageURL ()
{
    return pageURL;
}

public void setPageURL (String pageURL)
{
    this.pageURL = pageURL;
}

@Override
public String toString()
{
    return "ClassPojo [province = "+province+", pageURL = "+pageURL+"]";
}
}
		
		

