package Model;

public class    Article
{
    private float prix;
    private String reference;
    private String nom;
    private int quantite;

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    private String rayon;

    public float getPrix()
    {
        return prix;
    }

    public void setPrix(float prix)
    {
        this.prix = prix;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getRayon()
    {
        return rayon;
    }

    public void setRayon(String rayon)
    {
        this.rayon = rayon;
    }
}
