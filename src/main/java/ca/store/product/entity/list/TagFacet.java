package ca.store.product.entity.list;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TAG_FACET")
public class TagFacet {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "TAG_FACET_ID_CS")
	private int index;
	
	//private Selected[] selected;
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Collection<Selected> selected = new ArrayList<Selected>();
	
    //private Facets[] facets;
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Collection<Facets> facets = new ArrayList<Facets>();

    public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Collection<Selected> getSelected() {
		return selected;
	}

	public void setSelected(Collection<Selected> selected) {
		this.selected = selected;
	}

	public void setFacets(Collection<Facets> facets) {
		this.facets = facets;
	}
	public Collection<Facets> getFacets() {
		return facets;
	}
}
