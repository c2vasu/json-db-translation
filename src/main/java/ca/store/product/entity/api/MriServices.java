package ca.store.product.entity.api;


public class MriServices {

private Conditions conditions;

private Medications medications;

private NaturalProducts naturalProducts;

private TestAndProcedures testAndProcedures;

private Healthfeatures healthfeatures;

public Conditions getConditions ()
{
return conditions;
}

public void setConditions (Conditions conditions)
{
this.conditions = conditions;
}

public Medications getMedications ()
{
return medications;
}

public void setMedications (Medications medications)
{
this.medications = medications;
}

public NaturalProducts getNaturalProducts ()
{
return naturalProducts;
}

public void setNaturalProducts (NaturalProducts naturalProducts)
{
this.naturalProducts = naturalProducts;
}

public TestAndProcedures getTestAndProcedures ()
{
return testAndProcedures;
}

public void setTestAndProcedures (TestAndProcedures testAndProcedures)
{
this.testAndProcedures = testAndProcedures;
}

public Healthfeatures getHealthfeatures ()
{
return healthfeatures;
}

public void setHealthfeatures (Healthfeatures healthfeatures)
{
this.healthfeatures = healthfeatures;
}

@Override
public String toString()
{
return "ClassPojo [conditions = "+conditions+", medications = "+medications+", naturalProducts = "+naturalProducts+", testAndProcedures = "+testAndProcedures+", healthfeatures = "+healthfeatures+"]";
}
}
	
	

