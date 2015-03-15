package ca.store.product.entity.list;

public class EntityList {

    private String suggestionText;

    private CatFacets[] catFacets;

    private Docs[] docs;

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

    public CatFacets[] getCatFacets ()
    {
        return catFacets;
    }

    public void setCatFacets (CatFacets[] catFacets)
    {
        this.catFacets = catFacets;
    }

    public Docs[] getDocs ()
    {
        return docs;
    }

    public void setDocs (Docs[] docs)
    {
        this.docs = docs;
    }

    public TagFacet getTagFacet ()
    {
        return tagFacet;
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

    @Override
    public String toString()
    {
        return "ClassPojo [suggestionText = "+suggestionText+", catFacets = "+catFacets+", docs = "+docs+", tagFacet = "+tagFacet+", numFound = "+numFound+"]";
    }
}