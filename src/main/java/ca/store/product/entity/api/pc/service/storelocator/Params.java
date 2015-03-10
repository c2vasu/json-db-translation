package ca.store.product.entity.api.pc.service.storelocator;

public class Params {

private String proximity;

private String lang;

private String[] banner;

public String getProximity ()
{
return proximity;
}

public void setProximity (String proximity)
{
this.proximity = proximity;
}

public String getLang ()
{
return lang;
}

public void setLang (String lang)
{
this.lang = lang;
}

public String[] getBanner ()
{
return banner;
}

public void setBanner (String[] banner)
{
this.banner = banner;
}

@Override
public String toString()
{
return "ClassPojo [proximity = "+proximity+", lang = "+lang+", banner = "+banner+"]";
}
}
	
	

