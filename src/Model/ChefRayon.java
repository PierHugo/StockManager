package Model;

import java.util.ArrayList;

public class ChefRayon extends Personne {

    private boolean EstChefRayon;
    private Rayon Rayon;


    public Rayon getRayon() {
        return Rayon;
    }

    public void setRayon(Rayon rayon) {
        Rayon = rayon;
    }

    public boolean isEstChefRayon() {
        return EstChefRayon;
    }

    public void setEstChefRayon(boolean estChef) {
        EstChefRayon = estChef;
    }

    public ChefRayon(Personne personne, Rayon rayon){
        super(personne.getNom(), personne.getPrenom(), personne.getMail(), personne.getNomMagasin());
        EstChefRayon = true;
        Rayon = rayon;
    }

    //TODO : méthodes pour gérer les articles du rayon
    public void ajouterArticle (Article article) {
        Rayon.getArticles().add(article);
    }

    public void supprimerArticle (Article article) {
        Rayon.getArticles().remove(article);
    }

    public void modifierPrix (Article article, float prix) {
        int index = Rayon.getArticles().indexOf(article);
        Rayon.getArticles().get(index).setPrix(prix);
    }

//    public void modifierReference (Article article, String reference) {
//        int index = Rayon.getArticles().indexOf(article);
//        Rayon.getArticles().get(index).setReference(reference);
//    }

    public void modifierEnRayon (Article article, int enRayon) {
        int index = Rayon.getArticles().indexOf(article);
        Rayon.getArticles().get(index).setEnRayon(enRayon);
    }

    public void modifierEnStock (Article article, int enStock) {
        int index = Rayon.getArticles().indexOf(article);
        Rayon.getArticles().get(index).setEnStock(enStock);
    }

}
