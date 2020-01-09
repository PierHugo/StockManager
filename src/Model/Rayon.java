package Model;

import java.util.ArrayList;

public class Rayon
{
    private ArrayList<Article> ArticlesRayon;
    private String nom;
    int idRayon;

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public ArrayList<Article> getArticlesRayon() {
        return ArticlesRayon;
    }

    public void setArticlesRayon(ArrayList<Article> articlesRayon) {
        ArticlesRayon = articlesRayon;
    }

    public int getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(int idRayon) {
        this.idRayon = idRayon;
    }

    public Rayon(String nomParam) {
        ArticlesRayon = new ArrayList<>();
        nom = nomParam;
        idRayon = 0;
    }

    public Rayon(ArrayList<Article> articlesRayonParam, String nomParam, int idRayonParam) {
        ArticlesRayon = articlesRayonParam;
        nom = nomParam;
        idRayon = idRayonParam;
    }
}
