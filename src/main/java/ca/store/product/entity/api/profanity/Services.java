package ca.store.product.entity.api.profanity;

public class Services
{
    private Phrases phrases;

    public Phrases getPhrases ()
    {
        return phrases;
    }

    public void setPhrases (Phrases phrases)
    {
        this.phrases = phrases;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [phrases = "+phrases+"]";
    }
}