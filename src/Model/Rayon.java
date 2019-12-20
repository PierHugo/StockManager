package Model;

import java.util.ArrayList;

public class Rayon
{
    private ArrayList<Article> ArticlesRayon;
    private String nom;
    int idRayon;

    public ArrayList<Article> getArticles()
    {
        return ArticlesRayon;
    }

    public void setArticles(ArrayList<Article> articles)
    {
        ArticlesRayon = articles;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public Rayon() {
        ArticlesRayon = new ArrayList<>();
        nom = "";
        idRayon = 0;
    }

    public Rayon(ArrayList<Article> articlesRayonParam, String nomParam, int idRayonParam) {
        ArticlesRayon = articlesRayonParam;
        nom = nomParam;
        idRayon = idRayonParam;
    }
}
