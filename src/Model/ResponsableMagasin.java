package Model;

import java.io.IOException;

public class ResponsableMagasin  {

    private boolean estAdmin;
    private String prenom;
    private String nom;
    private String mail;
    private Magasin magasin;

    public boolean isEstAdmin() {
        return estAdmin;
    }

    public void setEstAdmin(boolean estAdmin) {
        this.estAdmin = estAdmin;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public  ResponsableMagasin(String prenomParam, String nomParam, String mailParam, Magasin magasinParam){
        estAdmin = true;
        prenom = prenomParam;
        nom = nomParam;
        mail = mailParam;
        magasin = magasinParam;
    }

    //TODO : Faire les méthodes pour ajouter, modifier, supprimer un employé d'un magasin.

    public void ajouterVendeur(Vendeur vendeur) {
        magasin.getVendeurs().add(vendeur);
    }

    public void supprimerVendeur (Vendeur vendeur) {
        magasin.getVendeurs().remove(vendeur);
    }

    public void changerRayon (Vendeur vendeur, Rayon rayon) {
        int index = magasin.getVendeurs().indexOf(vendeur);
        int newIdRayon = rayon.getIdRayon();
        magasin.getVendeurs().get(index).setRayon(rayon);
        magasin.getVendeurs().get(index).setIdRayon(newIdRayon);


    }

     public void modifierMail (Vendeur vendeur, String mail) {
        int index = magasin.getVendeurs().indexOf(vendeur);
        magasin.getVendeurs().get(index).setMail(mail);
     }

     public void modifierNomMagasin (Vendeur vendeur, String nomMagasin) {
        int index = magasin.getVendeurs().indexOf(vendeur);
        magasin.getVendeurs().get(index).setNomMagasin(nomMagasin);
     }



}