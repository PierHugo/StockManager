package Model;

public class Employe  extends Personne{
    private boolean EstEmploye;
    private boolean AccesAppli;


    public boolean isAccesAppli() {
        return AccesAppli;
    }

    public void setAccesAppli(boolean accesAppli) {
        AccesAppli = accesAppli;
    }

    public boolean isEstEmploye() {
        return EstEmploye;
    }

    public void setEstEmploye(boolean estEmploye) {
        EstEmploye = estEmploye;
    }

    public Employe(Personne personne, boolean estEmploye, boolean accesAppli) {
        super(personne.getNom(), personne.getPrenom(), personne.getMail(), personne.getNomMagasin());
        EstEmploye = estEmploye;
        AccesAppli = accesAppli;
    }

    public Employe() {
    }

    public Employe getEmploye() {
        return this;
    }
}
