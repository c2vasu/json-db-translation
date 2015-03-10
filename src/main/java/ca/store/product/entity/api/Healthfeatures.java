package ca.store.product.entity.api;

public class Healthfeatures {

private HealthfeaturesList healthfeaturesList;

private HealthfeaturesDetails healthfeaturesDetails;

public HealthfeaturesList getHealthfeaturesList ()
{
    return healthfeaturesList;
}

public void setHealthfeaturesList (HealthfeaturesList healthfeaturesList)
{
    this.healthfeaturesList = healthfeaturesList;
}

public HealthfeaturesDetails getHealthfeaturesDetails ()
{
    return healthfeaturesDetails;
}

public void setHealthfeaturesDetails (HealthfeaturesDetails healthfeaturesDetails)
{
    this.healthfeaturesDetails = healthfeaturesDetails;
}

@Override
public String toString()
{
    return "ClassPojo [healthfeaturesList = "+healthfeaturesList+", healthfeaturesDetails = "+healthfeaturesDetails+"]";
}
}
		
		

