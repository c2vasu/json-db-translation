package ca.store.product.entity.api.pc.service.storelocator;


public class MapDefaults {

private Center center;

private String zoom;

private String zoomDetail;

private String mapType;

public Center getCenter ()
{
    return center;
}

public void setCenter (Center center)
{
    this.center = center;
}

public String getZoom ()
{
    return zoom;
}

public void setZoom (String zoom)
{
    this.zoom = zoom;
}

public String getZoomDetail ()
{
    return zoomDetail;
}

public void setZoomDetail (String zoomDetail)
{
    this.zoomDetail = zoomDetail;
}

public String getMapType ()
{
    return mapType;
}

public void setMapType (String mapType)
{
    this.mapType = mapType;
}

@Override
public String toString()
{
    return "ClassPojo [center = "+center+", zoom = "+zoom+", zoomDetail = "+zoomDetail+", mapType = "+mapType+"]";
}
}
		
		

