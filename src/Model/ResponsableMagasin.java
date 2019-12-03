package Model;

public class ResponsableMagasin extends Employe
{

    private boolean EstAdmin;

    public boolean isEstAdmin()
    {
        return EstAdmin;
    }

    public void setEstAdmin(boolean estAdmin)
    {
        EstAdmin = estAdmin;
    }

    //TODO : Faire les méthodes pour ajouter, modifier, supprimer un employé d'un magasin. Révoquer les droits aussi.
}
