package ca.store.product.entity.api;

public class TestAndProcedures {

private TestandproceduresList testandproceduresList;

private TestandproceduresDetails testandproceduresDetails;

public TestandproceduresList getTestandproceduresList ()
{
    return testandproceduresList;
}

public void setTestandproceduresList (TestandproceduresList testandproceduresList)
{
    this.testandproceduresList = testandproceduresList;
}

public TestandproceduresDetails getTestandproceduresDetails ()
{
    return testandproceduresDetails;
}

public void setTestandproceduresDetails (TestandproceduresDetails testandproceduresDetails)
{
    this.testandproceduresDetails = testandproceduresDetails;
}

@Override
public String toString()
{
    return "ClassPojo [testandproceduresList = "+testandproceduresList+", testandproceduresDetails = "+testandproceduresDetails+"]";
}
}
		
		

