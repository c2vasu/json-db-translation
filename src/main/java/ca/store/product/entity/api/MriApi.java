package ca.store.product.entity.api;


public class MriApi {

private String dataType;

private String base;

private MriServices mriServices;

public String getDataType ()
{
return dataType;
}

public void setDataType (String dataType)
{
this.dataType = dataType;
}

public String getBase ()
{
return base;
}

public void setBase (String base)
{
this.base = base;
}

public MriServices getMriServices ()
{
return mriServices;
}

public void setMriServices (MriServices mriServices)
{
this.mriServices = mriServices;
}

@Override
public String toString()
{
return "ClassPojo [dataType = "+dataType+", base = "+base+", mriServices = "+mriServices+"]";
}
}
	
	

