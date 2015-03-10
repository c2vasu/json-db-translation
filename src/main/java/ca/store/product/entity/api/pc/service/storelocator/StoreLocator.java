package ca.store.product.entity.api.pc.service.storelocator;


public class StoreLocator {

private String pinUrlTpl;

private String defaultSearch;

private String pinShadowUrlTpl;

private MapDefaults mapDefaults;

public String getPinUrlTpl ()
{
    return pinUrlTpl;
}

public void setPinUrlTpl (String pinUrlTpl)
{
    this.pinUrlTpl = pinUrlTpl;
}

public String getDefaultSearch ()
{
    return defaultSearch;
}

public void setDefaultSearch (String defaultSearch)
{
    this.defaultSearch = defaultSearch;
}

public String getPinShadowUrlTpl ()
{
    return pinShadowUrlTpl;
}

public void setPinShadowUrlTpl (String pinShadowUrlTpl)
{
    this.pinShadowUrlTpl = pinShadowUrlTpl;
}

public MapDefaults getMapDefaults ()
{
    return mapDefaults;
}

public void setMapDefaults (MapDefaults mapDefaults)
{
    this.mapDefaults = mapDefaults;
}

@Override
public String toString()
{
    return "ClassPojo [pinUrlTpl = "+pinUrlTpl+", defaultSearch = "+defaultSearch+", pinShadowUrlTpl = "+pinShadowUrlTpl+", mapDefaults = "+mapDefaults+"]";
}
}
		
		

