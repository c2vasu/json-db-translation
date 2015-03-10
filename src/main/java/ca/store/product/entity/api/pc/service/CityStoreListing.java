package ca.store.product.entity.api.pc.service;

import ca.store.product.entity.api.pc.service.storelocator.Params;

public class CityStoreListing {

private String path;

private Params params;

public String getPath ()
{
return path;
}

public void setPath (String path)
{
this.path = path;
}

public Params getParams ()
{
return params;
}

public void setParams (Params params)
{
this.params = params;
}

@Override
public String toString()
{
return "ClassPojo [path = "+path+", params = "+params+"]";
}
}
	
	

