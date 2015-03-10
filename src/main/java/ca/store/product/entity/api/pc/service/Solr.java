package ca.store.product.entity.api.pc.service;

public class Solr {

private String listBaseURL;

private String searchBaseURL;

private String flyerBaseURL;

private String landingBaseURL;

public String getListBaseURL ()
{
return listBaseURL;
}

public void setListBaseURL (String listBaseURL)
{
this.listBaseURL = listBaseURL;
}

public String getSearchBaseURL ()
{
return searchBaseURL;
}

public void setSearchBaseURL (String searchBaseURL)
{
this.searchBaseURL = searchBaseURL;
}

public String getFlyerBaseURL ()
{
return flyerBaseURL;
}

public void setFlyerBaseURL (String flyerBaseURL)
{
this.flyerBaseURL = flyerBaseURL;
}

public String getLandingBaseURL ()
{
return landingBaseURL;
}

public void setLandingBaseURL (String landingBaseURL)
{
this.landingBaseURL = landingBaseURL;
}

@Override
public String toString()
{
return "ClassPojo [listBaseURL = "+listBaseURL+", searchBaseURL = "+searchBaseURL+", flyerBaseURL = "+flyerBaseURL+", landingBaseURL = "+landingBaseURL+"]";
}
}
	
	

