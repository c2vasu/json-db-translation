package ca.store.product.entity.list;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CHILDREN")
public class Children {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "CHILDREN_ID_CU")
	private int index;
	
	private String id;

    private Boolean selected;

    private Integer count;

    private String topRated;

    private String name;
    
    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Collection<Children> children = new ArrayList<Children>();
    
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

    public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Collection<Children> getChildren() {
		return children;
	}

	public void setChildren(Collection<Children> children) {
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
