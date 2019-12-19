package Model;

public class ResponsableMagasin  {

    private boolean EstAdmin;
    private String prenom;
    private String nom;
    private String mail;
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

    public  ResponsableMagasin(Vendeur vendeurParam, Magasin magasinParam){
        super(vendeurParam.getNom(), vendeurParam.getPrenom(), vendeurParam.getMail(), vendeurParam.getNomMagasin());
        EstAdmin = true;
        Magasin =  magasinParam;
        Magasin.setNom(vendeurParam.getNomMagasin());
        Magasin.setResponsableMagasin(this);
    }

    //TODO : Faire les méthodes pour ajouter, modifier, supprimer un employé d'un magasin. Révoquer les droits aussi.
    //TODO : Gérer les excéptions, cas d'ajouter un employe deja existant, supprimer un employe inexistant, etc
    public void ajouterEmploye(Employe employe) {
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

    public void revoquerDroit (Employe employe) {
        int index = Magasin.getEmployes().indexOf(employe);
        Magasin.getEmployes().get(index).setAccesAppli(false);

    }

    public void donnerDroit (Employe employe) {
        int index = Magasin.getEmployes().indexOf(employe);
        Magasin.getEmployes().get(index).setAccesAppli(true);

    }

    public void nommerChefRayon (Employe employe, Rayon rayon) {
        employe.setEstEmploye(false);
        ChefRayon chefRayon = new ChefRayon(employe, rayon);
        ajouterChefRayon(chefRayon);
        supprimerEmploye(employe);
    }

    public void destituerChefRayon (ChefRayon chefRayon) {
        chefRayon.setEstChefRayon(false);
        chefRayon.getRayon().setNom("");
        chefRayon.getRayon().setChefRayon(null);
        chefRayon.setRayon(null);
        Employe employe = new Employe (chefRayon);
        ajouterEmploye(employe);
        supprimerChefRayon(chefRayon);
    }

    public void changerRayon (ChefRayon chefRayon, Rayon rayon) {
        chefRayon.setRayon(rayon);
        rayon.setChefRayon(chefRayon);
    }
     public void modifierMail (Employe employe, String mail) {
        int index = Magasin.getEmployes().indexOf(employe);
        Magasin.getEmployes().get(index).setMail(mail);
     }

     public void modifierNomMagasin (Employe employe, String nomMagasin) {
        int index = Magasin.getEmployes().indexOf(employe);
        Magasin.getEmployes().get(index).setNomMagasin(nomMagasin);
     }



}