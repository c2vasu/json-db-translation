package ca.store.product.entity.api;

public class NaturalProducts {

private NaturalProductsDetails naturalProductsDetails;

private NaturalProductsList naturalProductsList;

public NaturalProductsDetails getNaturalProductsDetails ()
{
return naturalProductsDetails;
}

public void setNaturalProductsDetails (NaturalProductsDetails naturalProductsDetails)
{
this.naturalProductsDetails = naturalProductsDetails;
}

public NaturalProductsList getNaturalProductsList ()
{
return naturalProductsList;
}

public void setNaturalProductsList (NaturalProductsList naturalProductsList)
{
this.naturalProductsList = naturalProductsList;
}

@Override
public String toString()
{
return "ClassPojo [naturalProductsDetails = "+naturalProductsDetails+", naturalProductsList = "+naturalProductsList+"]";
}
}
	
	

