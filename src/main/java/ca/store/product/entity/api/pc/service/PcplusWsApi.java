package ca.store.product.entity.api.pc.service;

public class PcplusWsApi {

private String nationalOffers;

private String getSpotlightOffers;

private String getOffers;

private String decryptEmail;

private String emailLink;

public String getNationalOffers ()
{
    return nationalOffers;
}

public void setNationalOffers (String nationalOffers)
{
    this.nationalOffers = nationalOffers;
}

public String getGetSpotlightOffers ()
{
    return getSpotlightOffers;
}

public void setGetSpotlightOffers (String getSpotlightOffers)
{
    this.getSpotlightOffers = getSpotlightOffers;
}

public String getGetOffers ()
{
    return getOffers;
}

public void setGetOffers (String getOffers)
{
    this.getOffers = getOffers;
}

public String getDecryptEmail ()
{
    return decryptEmail;
}

public void setDecryptEmail (String decryptEmail)
{
    this.decryptEmail = decryptEmail;
}

public String getEmailLink ()
{
    return emailLink;
}

public void setEmailLink (String emailLink)
{
    this.emailLink = emailLink;
}

@Override
public String toString()
{
    return "ClassPojo [nationalOffers = "+nationalOffers+", getSpotlightOffers = "+getSpotlightOffers+", getOffers = "+getOffers+", decryptEmail = "+decryptEmail+", emailLink = "+emailLink+"]";
}
}
		
		

