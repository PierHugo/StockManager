package Model;

public class ResponsableMagasin extends Employe {

    private boolean EstAdmin;

    public boolean isEstAdmin() {
        return EstAdmin;
    }

    public void setEstAdmin(boolean estAdmin) {
        EstAdmin = estAdmin;
    }

    public  ResponsableMagasin(Employe employe){
        super(employe.isEstEmploye(), employe.getNom(), employe.getPrenom(), employe.getMagasin(), employe.getMail(), employe.isAccesAppli());
        setEstAdmin(true);
    }

    //TODO : Faire les méthodes pour ajouter, modifier, supprimer un employé d'un magasin. Révoquer les droits aussi.
}
