package ca.store.product.entity.api;

import ca.store.product.entity.api.ratings.RatingsApi;


public class Api {

private HomePageApi homePageApi;

private RatingsApi ratingsApi;

private MriApi mriApi;

private PcApi pcApi;

private Profanity profanity;

public HomePageApi getHomePageApi ()
{
return homePageApi;
}

public void setHomePageApi (HomePageApi homePageApi)
{
this.homePageApi = homePageApi;
}

public RatingsApi getRatingsApi ()
{
return ratingsApi;
}

public void setRatingsApi (RatingsApi ratingsApi)
{
this.ratingsApi = ratingsApi;
}

public MriApi getMriApi ()
{
return mriApi;
}

public void setMriApi (MriApi mriApi)
{
this.mriApi = mriApi;
}

public PcApi getPcApi ()
{
return pcApi;
}

public void setPcApi (PcApi pcApi)
{
this.pcApi = pcApi;
}

public Profanity getProfanity ()
{
return profanity;
}

public void setProfanity (Profanity profanity)
{
this.profanity = profanity;
}

@Override
public String toString()
{
return "ClassPojo [homePageApi = "+homePageApi+", ratingsApi = "+ratingsApi+", mriApi = "+mriApi+", pcApi = "+pcApi+", profanity = "+profanity+"]";
}
}
	
	


