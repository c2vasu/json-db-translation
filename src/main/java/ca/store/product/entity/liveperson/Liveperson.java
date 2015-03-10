package ca.store.product.entity.liveperson;

public class Liveperson {

private String lpNumber;

private String lpLanguage;

private String lpUnit;

public String getLpNumber ()
{
    return lpNumber;
}

public void setLpNumber (String lpNumber)
{
    this.lpNumber = lpNumber;
}

public String getLpLanguage ()
{
    return lpLanguage;
}

public void setLpLanguage (String lpLanguage)
{
    this.lpLanguage = lpLanguage;
}

public String getLpUnit ()
{
    return lpUnit;
}

public void setLpUnit (String lpUnit)
{
    this.lpUnit = lpUnit;
}

@Override
public String toString()
{
    return "ClassPojo [lpNumber = "+lpNumber+", lpLanguage = "+lpLanguage+", lpUnit = "+lpUnit+"]";
}
}
		
		

