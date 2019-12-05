package Model;

import java.util.ArrayList;

public class Magasin {
    private ArrayList<Rayon> rayons;
    private ArrayList<Employe> employes;
    private ArrayList<ChefRayon> chefsRayon;
    private String nom;
    private ResponsableMagasin responsableMagasin;

    public ArrayList<Rayon> getRayons() {
        return rayons;
    }

    public void setRayons(ArrayList<Rayon> rayons) {
        this.rayons = rayons;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public ArrayList<ChefRayon> getChefsRayon() {
        return chefsRayon;
    }

    public void setChefsRayon(ArrayList<ChefRayon> chefsRayon) {
        this.chefsRayon = chefsRayon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ResponsableMagasin getResponsableMagasin() {
        return responsableMagasin;
    }

    public void setResponsableMagasin(ResponsableMagasin responsableMagasin) {
        this.responsableMagasin = responsableMagasin;
    }

}
