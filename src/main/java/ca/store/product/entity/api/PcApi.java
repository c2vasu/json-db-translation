package ca.store.product.entity.api;

import ca.store.product.entity.api.pc.service.Services;

public class PcApi {

private Services services;

private String dataType;

private String base;

public Services getServices ()
{
    return services;
}

public void setServices (Services services)
{
    this.services = services;
}

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

@Override
public String toString()
{
    return "ClassPojo [services = "+services+", dataType = "+dataType+", base = "+base+"]";
}
}
		
		

