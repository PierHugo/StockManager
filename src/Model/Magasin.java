package Model;

import java.util.ArrayList;

public class Magasin
{
    private ArrayList<Article> articles;
    private ArrayList<Rayon> rayons;
    private ArrayList<Vendeur> vendeurs;
    private String nom;
    private String nomResponsableMagasin;


    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public ArrayList<Rayon> getRayons() {
        return rayons;
    }

    public void setRayons(ArrayList<Rayon> rayons) {
        this.rayons = rayons;
    }

    public ArrayList<Vendeur> getVendeurs() {
        return vendeurs;
    }

    public void setVendeurs(ArrayList<Vendeur> vendeurs) {
        this.vendeurs = vendeurs;
    }

    public String getNomResponsableMagasin() {
        return nomResponsableMagasin;
    }

    public void setNomResponsableMagasin(String nomResponsableMagasin) {
        this.nomResponsableMagasin = nomResponsableMagasin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Magasin(String nomParam, String nomResponsableMagasinParam){
        articles = new ArrayList<>();
        rayons = new ArrayList<>();
        vendeurs = new ArrayList<>();
        nom = nomParam;
        nomResponsableMagasin = nomResponsableMagasinParam;
    }
    public Magasin(ArrayList<Article> articlesParam, ArrayList<Rayon> rayonsParam, ArrayList<Vendeur> vendeursParam, String nomParam, String nomResponsableMagasinParam) {
        articles = articlesParam;
        rayons = rayonsParam;
        vendeurs = vendeursParam;
        nom = nomParam;
        nomResponsableMagasin = nomResponsableMagasinParam;
    }

}
