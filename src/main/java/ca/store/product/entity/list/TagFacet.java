package ca.store.product.entity.list;

public class TagFacet {
	
	private Selected[] selected;

    private Facets[] facets;

    public Selected[] getSelected ()
    {
        return selected;
    }

    public void setSelected (Selected[] selected)
    {
        this.selected = selected;
    }

    public Facets[] getFacets ()
    {
        return facets;
    }

    public void setFacets (Facets[] facets)
    {
        this.facets = facets;
    }

}
