package ca.store.product.entity.api.ratings;

public class QuickRating {

private String path;

private String params;

public String getPath ()
{
return path;
}

public void setPath (String path)
{
this.path = path;
}

public String getParams ()
{
return params;
}

public void setParams (String params)
{
this.params = params;
}

@Override
public String toString()
{
return "ClassPojo [path = "+path+", params = "+params+"]";
}
}
	
	

