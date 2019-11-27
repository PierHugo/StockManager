package Model;

public class Employe {
    private boolean EstEmploye;
    private String Nom;
    private String Prenom;
    private String Magasin;
    private String Mail;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getMagasin() {
        return Magasin;
    }

    public void setMagasin(String magasin) {
        Magasin = magasin;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public boolean isEstEmploye() {
        return EstEmploye;
    }

    public void setEstEmploye(boolean estEmploye) {
        EstEmploye = estEmploye;
    }

    public Employe(boolean estEmploye, String nom, String prenom, String magasin, String mail) {
        EstEmploye = estEmploye;
        Nom = nom;
        Prenom = prenom;
        Magasin = magasin;
        Mail = mail;
    }

    public Employe() {
    }
}
