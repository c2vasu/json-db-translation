package ca.store.product.entity.pcplus;

public class Pcplus {

private String interstitialduration;

private String welcomeOverlayPath;

public String getInterstitialduration ()
{
return interstitialduration;
}

public void setInterstitialduration (String interstitialduration)
{
this.interstitialduration = interstitialduration;
}

public String getWelcomeOverlayPath ()
{
return welcomeOverlayPath;
}

public void setWelcomeOverlayPath (String welcomeOverlayPath)
{
this.welcomeOverlayPath = welcomeOverlayPath;
}

@Override
public String toString()
{
return "ClassPojo [interstitialduration = "+interstitialduration+", welcomeOverlayPath = "+welcomeOverlayPath+"]";
}
}
	
	

