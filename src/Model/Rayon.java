package Model;

import java.util.ArrayList;

public class Rayon
{
    private ArrayList<Article> Articles;
    private String nom;
    private ChefRayon chefRayon;

    public ArrayList<Article> getArticles()
    {
        return Articles;
    }

    public void setArticles(ArrayList<Article> articles)
    {
        Articles = articles;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public ChefRayon getChefRayon()
    {
        return chefRayon;
    }

    public void setChefRayon(ChefRayon chefRayon)
    {
        this.chefRayon = chefRayon;
    }
}
