package ca.store.product.entity.api.pc.service;


public class Services {

private CityStoreListing cityStoreListing;

private Store store;

private StoreLocator storeLocator;

private String alertURL;

private PcplusWsApi pcplusWsApi;

private Solr solr;

public CityStoreListing getCityStoreListing ()
{
    return cityStoreListing;
}

public void setCityStoreListing (CityStoreListing cityStoreListing)
{
    this.cityStoreListing = cityStoreListing;
}

public Store getStore ()
{
    return store;
}

public void setStore (Store store)
{
    this.store = store;
}

public StoreLocator getStoreLocator ()
{
    return storeLocator;
}

public void setStoreLocator (StoreLocator storeLocator)
{
    this.storeLocator = storeLocator;
}

public String getAlertURL ()
{
    return alertURL;
}

public void setAlertURL (String alertURL)
{
    this.alertURL = alertURL;
}

public PcplusWsApi getPcplusWsApi ()
{
    return pcplusWsApi;
}

public void setPcplusWsApi (PcplusWsApi pcplusWsApi)
{
    this.pcplusWsApi = pcplusWsApi;
}

public Solr getSolr ()
{
    return solr;
}

public void setSolr (Solr solr)
{
    this.solr = solr;
}

@Override
public String toString()
{
    return "ClassPojo [cityStoreListing = "+cityStoreListing+", store = "+store+", storeLocator = "+storeLocator+", alertURL = "+alertURL+", pcplusWsApi = "+pcplusWsApi+", solr = "+solr+"]";
}
}
		
		

