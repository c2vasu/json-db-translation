package ca.store.product.entity.api.ratings;

public class Services {

private QuickRating quickRating;

public QuickRating getQuickRating ()
{
    return quickRating;
}

public void setQuickRating (QuickRating quickRating)
{
    this.quickRating = quickRating;
}

@Override
public String toString()
{
    return "ClassPojo [quickRating = "+quickRating+"]";
}
}
		
		

