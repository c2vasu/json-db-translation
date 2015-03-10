package ca.store.product.entity.api;

import ca.store.product.entity.common.Params;

public class ConditionsDetails {

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
	
	

