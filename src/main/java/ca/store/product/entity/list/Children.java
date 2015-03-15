package ca.store.product.entity.list;

public class Children {
	
	private String id;

    private Boolean selected;

    private Integer count;

    private String topRated;

    private String name;

    private Children children[];

    private String href;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Boolean getSelected ()
    {
        return selected;
    }

    public void setSelected (Boolean selected)
    {
        this.selected = selected;
    }

    public Integer getCount ()
    {
        return count;
    }

    public void setCount (Integer count)
    {
        this.count = count;
    }

    public String getTopRated ()
    {
        return topRated;
    }

    public void setTopRated (String topRated)
    {
        this.topRated = topRated;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Children[] getChildren ()
    {
        return children;
    }

    public void setChildren (Children children[])
    {
        this.children = children;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

}
