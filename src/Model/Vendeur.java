package Model;

public class Vendeur {
    private String nom;
    private String prenom;
    private String mail;
    private String nomMagasin;
    private int idRayon;

    public int getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(int idRayon) {
        this.idRayon = idRayon;
    }

    public String getNomMagasin() {
        return nomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        nomMagasin = nomMagasin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Vendeur(String nomParam, String prenomParam, String mailParam, String nomMagasinParam, int idRayonParam) {
        nom = nomParam;
        prenom = prenomParam;
        mail = mailParam;
        nomMagasin = nomMagasinParam;
        idRayon = idRayonParam;
    }
}
