package Test;

import Model.Magasin;
import Model.Rayon;
import Model.ResponsableMagasin;
import Model.Vendeur;

import static org.junit.jupiter.api.Assertions.*;

class ResponsableMagasinTest {
    Magasin magasinTest = new Magasin("MagasinTest", "Erwann Piedloup");
    ResponsableMagasin responsableMagasinTest = new ResponsableMagasin("Erwann", "Piedloup", "erwann.piedloup@mail.com", magasinTest);

    @org.junit.jupiter.api.Test
    void ajouterEmploye() {
        Vendeur vendeurTest = new Vendeur("Genty", "Morgane", "morgane.genty@mail.com", "MagasinTest", 0, null);

        responsableMagasinTest.ajouterVendeur(vendeurTest);
        assertTrue(responsableMagasinTest.getMagasin().getVendeurs().contains(vendeurTest));
    }

    @org.junit.jupiter.api.Test
    void supprimerEmploye() {
        Vendeur vendeurTest = new Vendeur("Genty", "Morgane", "morgane.genty@mail.com", "MagasinTest", 0, null);
        responsableMagasinTest.ajouterVendeur(vendeurTest);

        responsableMagasinTest.supprimerVendeur(vendeurTest);
        assertFalse(responsableMagasinTest.getMagasin().getVendeurs().contains(vendeurTest));
    }

    @org.junit.jupiter.api.Test
    void changerRayon() {
        Vendeur vendeurTest = new Vendeur("Genty", "Morgane", "morgane.genty@mail.com", "MagasinTest", 0, null);
        Rayon rayonTest = new Rayon(null, "Rayon Test", 1);
        responsableMagasinTest.ajouterVendeur(vendeurTest);

        responsableMagasinTest.changerRayon(vendeurTest, rayonTest);
        assertEquals(1, vendeurTest.getIdRayon());
    }

    @org.junit.jupiter.api.Test
    void modifierMail() {
        Vendeur vendeurTest = new Vendeur("Genty", "Morgane", "morgane.genty@mail.com", "MagasinTest", 0, null);
        String mailTest = "morgane.genty@mail2.com";
        responsableMagasinTest.ajouterVendeur(vendeurTest);

        responsableMagasinTest.modifierMail(vendeurTest, mailTest);
        assertEquals(mailTest, vendeurTest.getMail());
    }

    @org.junit.jupiter.api.Test
    void modifierNomMagasin() {
        Vendeur vendeurTest = new Vendeur("Genty", "Morgane", "morgane.genty@mail.com", "MagasinTest", 0, null);
        String nomMagasinTest = "MagasinTest2";
        responsableMagasinTest.ajouterVendeur(vendeurTest);

        responsableMagasinTest.modifierNomMagasin(vendeurTest, nomMagasinTest);
        assertEquals(nomMagasinTest, vendeurTest.getNomMagasin());
    }
}