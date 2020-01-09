package Model;

public class Vendeur {
    private String nom;
    private String prenom;
    private String mail;
    private String nomMagasin;
    private int idRayon;
    private Rayon rayon;

    public int getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(int idRayon) {
        this.idRayon = idRayon;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public String getNomMagasin() {
        return nomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        this.nomMagasin = nomMagasin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Vendeur(String nomParam, String prenomParam, String mailParam, String nomMagasinParam, int idRayonParam, Rayon rayonParam) {
        nom = nomParam;
        prenom = prenomParam;
        mail = mailParam;
        nomMagasin = nomMagasinParam;
        idRayon = idRayonParam;
        rayon = rayonParam;
    }

    public void ajouterArticle (Article article) {
        rayon.getArticlesRayon().add(article);
    }

    public void supprimerArticle (Article article) {
        rayon.getArticlesRayon().remove(article);
    }

    public void modifierPrix (Article article, double prix) {
        int index = rayon.getArticlesRayon().indexOf(article);
        rayon.getArticlesRayon().get(index).setPrix(prix);
    }

    public void modifierQuantite (Article article, int quantite) {
        int index = rayon.getArticlesRayon().indexOf(article);
        rayon.getArticlesRayon().get(index).setQuantite(quantite);
    }

    public void modifierNomRayon (Article article, String nomRayon) {
        int index = rayon.getArticlesRayon().indexOf(article);
        rayon.getArticlesRayon().get(index).setNomRayon(nomRayon);
    }
}
