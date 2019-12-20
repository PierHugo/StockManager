package Test;

import Model.Magasin;
import Model.ResponsableMagasin;
import Model.Vendeur;

import static org.junit.jupiter.api.Assertions.*;

class ResponsableMagasinTest {
    Magasin magasinTest = new Magasin("MagasinTest", "Erwann Piedloup");
    ResponsableMagasin responsableMagasinTest = new ResponsableMagasin("Erwann", "Piedloup", "erwann.piedloup@mail.com", magasinTest);

    @org.junit.jupiter.api.Test
    void ajouterEmploye() {
        Vendeur vendeurTest = new Vendeur("Genty", "Morgane", "morgane.genty@mail.com", "MagasinTest", 0);

    }

    @org.junit.jupiter.api.Test
    void supprimerEmploye() {
    }

    @org.junit.jupiter.api.Test
    void changerRayon() {
    }

    @org.junit.jupiter.api.Test
    void modifierMail() {
    }

    @org.junit.jupiter.api.Test
    void modifierNomMagasin() {
    }
}