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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ENTITY_LIST")
public class EntityList {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "ENTITY_LIST_ID_CU")
	private int index;
	
    private String suggestionText;
    
    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Collection<CatFacets> catFacets = new ArrayList<CatFacets>();
    //private CatFacets[] catFacets;

    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Collection<Docs> docs = new ArrayList<Docs>();
    
    @ManyToOne(optional=false, fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private TagFacet tagFacet;

    private String numFound;

    public String getSuggestionText ()
    {
        return suggestionText;
    }

    public void setSuggestionText (String suggestionText)
    {
        this.suggestionText = suggestionText;
    }

    public TagFacet getTagFacet ()
    {
        return tagFacet;
    }
    

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Collection<CatFacets> getCatFacets() {
		return catFacets;
	}

	public void setCatFacets(Collection<CatFacets> catFacets) {
		this.catFacets = catFacets;
	}

	public Collection<Docs> getDocs() {
		return docs;
	}

	public void setDocs(Collection<Docs> docs) {
		this.docs = docs;
	}

	public void setTagFacet (TagFacet tagFacet)
    {
        this.tagFacet = tagFacet;
    }

    public String getNumFound ()
    {
        return numFound;
    }

    public void setNumFound (String numFound)
    {
        this.numFound = numFound;
    }
}