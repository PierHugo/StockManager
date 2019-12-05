package Model;

public class Personne {
    private String Nom;
    private String Prenom;
    private String Mail;
    private String NomMagasin;

    public String getNomMagasin() {
        return NomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        NomMagasin = nomMagasin;
    }

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

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public Personne() {
    }

    public Personne(String nom, String prenom, String mail, String nomMagasin) {
        Nom = nom;
        Prenom = prenom;
        Mail = mail;
        NomMagasin = nomMagasin;
    }
}
