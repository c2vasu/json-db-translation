package ca.store.product.entity.list;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOCS")
public class Docs {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "DOCS_ID_CU")
	private int index;
	
	private String tagLabel;
	@Column(name = "DOCS1")
	private String desc;

    private String img;

    private String fullDesc;

	private String numRating;

    private boolean ct;

    private String articlebodyleft;

    private String pcProductIngredientLink;

    private String imgRendition;

    private String category;

    private String title;

    private String shortTitle;

    private boolean bl;

    private String path;

    private String rating;

    private String shortName;

    private String imgTitle;
   

    public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getTagLabel ()
    {
        return tagLabel;
    }

    public void setTagLabel (String tagLabel)
    {
        this.tagLabel = tagLabel;
    }
    public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

    public String getImg ()
    {
        return img;
    }

    public void setImg (String img)
    {
        this.img = img;
    }

    public String getFullDesc ()
    {
        return fullDesc;
    }

    public void setFullDesc (String fullDesc)
    {
        this.fullDesc = fullDesc;
    }

    public String getNumRating ()
    {
        return numRating;
    }

    public void setNumRating (String numRating)
    {
        this.numRating = numRating;
    }

    public boolean isCt() {
		return ct;
	}

	public void setCt(boolean ct) {
		this.ct = ct;
	}

	public boolean isBl() {
		return bl;
	}

	public void setBl(boolean bl) {
		this.bl = bl;
	}

	public String getArticlebodyleft ()
    {
        return articlebodyleft;
    }

    public void setArticlebodyleft (String articlebodyleft)
    {
        this.articlebodyleft = articlebodyleft;
    }

    public String getPcProductIngredientLink ()
    {
        return pcProductIngredientLink;
    }

    public void setPcProductIngredientLink (String pcProductIngredientLink)
    {
        this.pcProductIngredientLink = pcProductIngredientLink;
    }

    public String getImgRendition ()
    {
        return imgRendition;
    }

    public void setImgRendition (String imgRendition)
    {
        this.imgRendition = imgRendition;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getShortTitle ()
    {
        return shortTitle;
    }

    public void setShortTitle (String shortTitle)
    {
        this.shortTitle = shortTitle;
    }

    public String getPath ()
    {
        return path;
    }

    public void setPath (String path)
    {
        this.path = path;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getShortName ()
    {
        return shortName;
    }

    public void setShortName (String shortName)
    {
        this.shortName = shortName;
    }

    public String getImgTitle ()
    {
        return imgTitle;
    }

    public void setImgTitle (String imgTitle)
    {
        this.imgTitle = imgTitle;
    }
}
