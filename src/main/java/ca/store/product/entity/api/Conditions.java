package ca.store.product.entity.api;

public class Conditions {

private ConditionsDetails conditionsDetails;

private ConditionsList conditionsList;

public ConditionsDetails getConditionsDetails ()
{
return conditionsDetails;
}

public void setConditionsDetails (ConditionsDetails conditionsDetails)
{
this.conditionsDetails = conditionsDetails;
}

public ConditionsList getConditionsList ()
{
return conditionsList;
}

public void setConditionsList (ConditionsList conditionsList)
{
this.conditionsList = conditionsList;
}

@Override
public String toString()
{
return "ClassPojo [conditionsDetails = "+conditionsDetails+", conditionsList = "+conditionsList+"]";
}
}
	
	

