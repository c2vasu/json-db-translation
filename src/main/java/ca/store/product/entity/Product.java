package ca.store.product.entity;

import ca.store.product.entity.analytics.Analytics;
import ca.store.product.entity.api.Api;
import ca.store.product.entity.api.pc.service.StoreLocator;
import ca.store.product.entity.department.DepartmentId;
import ca.store.product.entity.headerInfo.HeaderInfo;
import ca.store.product.entity.liveperson.Liveperson;
import ca.store.product.entity.pcplus.Pcplus;
import ca.store.product.entity.province.ProvincePrompt;

public class Product {

private String departmentFlyerPicks;

private String accessMode;

private StoreLocator storeLocator;

private String[] cssToShow;

private String[] cssToHide;

private Analytics analytics;

private String secondarylogostores;

private Liveperson liveperson;

private ProvincePrompt[] provincePrompt;

private String cookieExpiry;

private HeaderInfo headerInfo;

private Pcplus pcplus;

private String currentDate;

private String bannerCode;

private String hardDiscountBanner;

private String yhmhCookieDomain;

private String cookieDomain;

private Api api;

private DepartmentId departmentId;

public String getDepartmentFlyerPicks ()
{
    return departmentFlyerPicks;
}

public void setDepartmentFlyerPicks (String departmentFlyerPicks)
{
    this.departmentFlyerPicks = departmentFlyerPicks;
}

public String getAccessMode ()
{
    return accessMode;
}

public void setAccessMode (String accessMode)
{
    this.accessMode = accessMode;
}

public StoreLocator getStoreLocator ()
{
    return storeLocator;
}

public void setStoreLocator (StoreLocator storeLocator)
{
    this.storeLocator = storeLocator;
}

public String[] getCssToShow ()
{
    return cssToShow;
}

public void setCssToShow (String[] cssToShow)
{
    this.cssToShow = cssToShow;
}

public String[] getCssToHide ()
{
    return cssToHide;
}

public void setCssToHide (String[] cssToHide)
{
    this.cssToHide = cssToHide;
}

public Analytics getAnalytics ()
{
    return analytics;
}

public void setAnalytics (Analytics analytics)
{
    this.analytics = analytics;
}

public String getSecondarylogostores ()
{
    return secondarylogostores;
}

public void setSecondarylogostores (String secondarylogostores)
{
    this.secondarylogostores = secondarylogostores;
}

public Liveperson getLiveperson ()
{
    return liveperson;
}

public void setLiveperson (Liveperson liveperson)
{
    this.liveperson = liveperson;
}

public ProvincePrompt[] getProvincePrompt ()
{
    return provincePrompt;
}

public void setProvincePrompt (ProvincePrompt[] provincePrompt)
{
    this.provincePrompt = provincePrompt;
}

public String getCookieExpiry ()
{
    return cookieExpiry;
}

public void setCookieExpiry (String cookieExpiry)
{
    this.cookieExpiry = cookieExpiry;
}

public HeaderInfo getHeaderInfo ()
{
    return headerInfo;
}

public void setHeaderInfo (HeaderInfo headerInfo)
{
    this.headerInfo = headerInfo;
}

public Pcplus getPcplus ()
{
    return pcplus;
}

public void setPcplus (Pcplus pcplus)
{
    this.pcplus = pcplus;
}

public String getCurrentDate ()
{
    return currentDate;
}

public void setCurrentDate (String currentDate)
{
    this.currentDate = currentDate;
}

public String getBannerCode ()
{
    return bannerCode;
}

public void setBannerCode (String bannerCode)
{
    this.bannerCode = bannerCode;
}

public String getHardDiscountBanner ()
{
    return hardDiscountBanner;
}

public void setHardDiscountBanner (String hardDiscountBanner)
{
    this.hardDiscountBanner = hardDiscountBanner;
}

public String getYhmhCookieDomain ()
{
    return yhmhCookieDomain;
}

public void setYhmhCookieDomain (String yhmhCookieDomain)
{
    this.yhmhCookieDomain = yhmhCookieDomain;
}

public String getCookieDomain ()
{
    return cookieDomain;
}

public void setCookieDomain (String cookieDomain)
{
    this.cookieDomain = cookieDomain;
}

public Api getApi ()
{
    return api;
}

public void setApi (Api api)
{
    this.api = api;
}

public DepartmentId getDepartmentId ()
{
    return departmentId;
}

public void setDepartmentId (DepartmentId departmentId)
{
    this.departmentId = departmentId;
}

@Override
public String toString()
{
    return "ClassPojo [departmentFlyerPicks = "+departmentFlyerPicks+", accessMode = "+accessMode+", storeLocator = "+storeLocator+", cssToShow = "+cssToShow+", cssToHide = "+cssToHide+", analytics = "+analytics+", secondarylogostores = "+secondarylogostores+", liveperson = "+liveperson+", provincePrompt = "+provincePrompt+", cookieExpiry = "+cookieExpiry+", headerInfo = "+headerInfo+", pcplus = "+pcplus+", currentDate = "+currentDate+", bannerCode = "+bannerCode+", hardDiscountBanner = "+hardDiscountBanner+", yhmhCookieDomain = "+yhmhCookieDomain+", cookieDomain = "+cookieDomain+", api = "+api+", departmentId = "+departmentId+"]";
}
}
		
		

