package ca.store.product.entity.analytics;

public class Analytics {

private String enabled;

private Data data;

public String getEnabled ()
{
    return enabled;
}

public void setEnabled (String enabled)
{
    this.enabled = enabled;
}

public Data getData ()
{
    return data;
}

public void setData (Data data)
{
    this.data = data;
}

@Override
public String toString()
{
    return "ClassPojo [enabled = "+enabled+", data = "+data+"]";
}
}
		
		

