package Model;

import java.io.IOException;

public class ResponsableMagasin  extends Personne{

    private boolean EstAdmin;
    private Magasin Magasin;

    public boolean isEstAdmin() {
        return EstAdmin;
    }

    public void setEstAdmin(boolean estAdmin) {
        EstAdmin = estAdmin;
    }

    public Magasin getMagasin() {
        return Magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.Magasin = magasin;
    }

    public  ResponsableMagasin(Personne personne, boolean estAdmin, Magasin magasin){
        super(personne.getNom(), personne.getPrenom(), personne.getMail(), personne.getNomMagasin());
        EstAdmin = estAdmin;
        Magasin =  magasin;
    }

    //TODO : Faire les méthodes pour ajouter, modifier, supprimer un employé d'un magasin. Révoquer les droits aussi.
    //TODO : Gérer les excéptions, cas d'ajouter un employe deja existant, supprimer un employe inexistant, etc
    public void ajouterEmploye(Employe employe) throws IOException{
        Magasin.getEmployes().add(employe);
    }

    public void supprimerEmploye (Employe employe) {
        Magasin.getEmployes().remove(employe);
    }

    public void ajouterChefRayon(ChefRayon chefRayon) {
        Magasin.getChefsRayon().add(chefRayon);
    }

    public void supprimerChefRayon (ChefRayon chefRayon) {
        Magasin.getChefsRayon().remove(chefRayon);
    }

    public void revoquerDroit (Employe employe) throws IOException{
        int index = Magasin.getEmployes().indexOf(employe);
        Magasin.getEmployes().get(index).setAccesAppli(false);

    }

    public void donnerDroit (Employe employe) throws IOException {
        int index = Magasin.getEmployes().indexOf(employe);
        Magasin.getEmployes().get(index).setAccesAppli(true);

    }

    public void nommerChefRayon (Employe employe, Rayon rayon) {
        employe.setEstEmploye(false);
        supprimerEmploye(employe);
        new ChefRayon(employe, rayon);
    }
}
