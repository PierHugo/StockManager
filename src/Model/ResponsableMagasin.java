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
    public void ajouterEmploye(Employe e) throws IOException{
        Magasin.getEmployes().add(e);
    }

    public void supprimerEmploye (Employe e) {
        Magasin.getEmployes().remove(e);
    }

    public void revoquerDroit (Employe e) throws IOException{
        int index = Magasin.getEmployes().indexOf(e);
        Magasin.getEmployes().get(index).setAccesAppli(false);

    }

    public void donnerDroit (Employe e) throws IOException {
        int index = Magasin.getEmployes().indexOf(e);
        Magasin.getEmployes().get(index).setAccesAppli(true);

    }

    public void nommerChefRayon () {

    }
}
