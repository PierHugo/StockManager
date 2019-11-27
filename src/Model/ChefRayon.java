package Model;

public class ChefRayon extends Employe {

    private boolean EstChef;
    private String Rayon;

    public String getRayon() {
        return Rayon;
    }

    public void setRayon(String rayon) {
        Rayon = rayon;
    }

    public boolean isEstChef() {
        return EstChef;
    }

    public void setEstChef(boolean estChef) {
        EstChef = estChef;
    }

    public ChefRayon(Employe employe){
        super(employe.isEstEmploye(), employe.getPrenom(), employe.getNom(), employe.getMagasin(), employe.getMail());
        setEstChef(true);
        Rayon = getRayon();
    }

    public ChefRayon() {
    }

}
