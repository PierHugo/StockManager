package Model;

public class Employe
{
    private boolean EstEmploye;
    private String Nom;
    private String Prenom;
    private String Magasin;
    private String Mail;
    private String motDePasse;
    private boolean AccesAppli;

    public Employe(String nom, String prenom, String mail)
    {
        EstEmploye = true;
        Nom = nom;
        Prenom = prenom;
        Magasin = null;
        Mail = mail;
        AccesAppli = true;
    }

    public Employe()
    {
    }

    public String getMotDePasse()
    {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse)
    {
        this.motDePasse = motDePasse;
    }

    public boolean isAccesAppli()
    {
        return AccesAppli;
    }

    public void setAccesAppli(boolean accesAppli)
    {
        AccesAppli = accesAppli;
    }

    public String getNom()
    {
        return Nom;
    }

    public void setNom(String nom)
    {
        Nom = nom;
    }

    public String getPrenom()
    {
        return Prenom;
    }

    public void setPrenom(String prenom)
    {
        Prenom = prenom;
    }

    public String getMagasin()
    {
        return Magasin;
    }

    public void setMagasin(String magasin)
    {
        Magasin = magasin;
    }

    public String getMail()
    {
        return Mail;
    }

    public void setMail(String mail)
    {
        Mail = mail;
    }

    public boolean isEstEmploye()
    {
        return EstEmploye;
    }

    public void setEstEmploye(boolean estEmploye)
    {
        EstEmploye = estEmploye;
    }
}
