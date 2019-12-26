package Model;

public class    Article
{
    private float prix;
    private String reference;
    private String nom;
    private int quantite;
    private String nomRayon;

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

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

    public String getNomRayon()
    {
        return nomRayon;
    }

    public void setNomRayon(String nomRayon)
    {
        this.nomRayon = nomRayon;
    }
}
