package Model;

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

}
