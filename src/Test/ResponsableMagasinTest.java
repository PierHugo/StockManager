package Test;

import static org.junit.Assert.*;

import Model.*;
import org.junit.Test;

public class ResponsableMagasinTest {
    private Vendeur responsableTest = new Vendeur("Test", "Osterone", "test.osterone@gmail.com", "MagasinTest");

    @Test
    public final void testAjouterEmploye() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        Employe employeTest = new Employe(vendeurTest);

        responsableMagasinTest.ajouterEmploye(employeTest);
       assertEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().contains(employeTest));

    }

    @Test
    public final void testSupprimerEmploye() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        Employe employeTest = new Employe(vendeurTest);
        responsableMagasinTest.getMagasin().getEmployes().add(employeTest);

        responsableMagasinTest.supprimerEmploye(employeTest);
        assertNotEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().contains(employeTest));
    }

    @Test
    public final void testAjouterChefRayon() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        Rayon rayonTest = new Rayon();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        ChefRayon chefRayonTest = new ChefRayon(vendeurTest, rayonTest);

        responsableMagasinTest.ajouterChefRayon(chefRayonTest);
        assertEquals(resultat, responsableMagasinTest.getMagasin().getChefsRayon().contains(chefRayonTest));
    }

    @Test
    public final void testSupprimerChefRayon() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        Rayon rayonTest = new Rayon();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        ChefRayon chefRayonTest = new ChefRayon(vendeurTest, rayonTest);
        responsableMagasinTest.getMagasin().getChefsRayon().add(chefRayonTest);

        responsableMagasinTest.supprimerChefRayon(chefRayonTest);
        assertNotEquals(resultat, responsableMagasinTest.getMagasin().getChefsRayon().contains(chefRayonTest));
    }

    @Test
    public final void testRevoquerDroit() {
        boolean resultat = false;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        Employe employeTest = new Employe(vendeurTest);
        responsableMagasinTest.getMagasin().getEmployes().add(employeTest);

        int indexTest = responsableMagasinTest.getMagasin().getEmployes().indexOf(employeTest);
        responsableMagasinTest.revoquerDroit(employeTest);
        assertEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().get(indexTest).isAccesAppli());

    }

    @Test
    public final void testDonnerDroit() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        Employe employeTest = new Employe(vendeurTest);
        responsableMagasinTest.getMagasin().getEmployes().add(employeTest);

        int indexTest = responsableMagasinTest.getMagasin().getEmployes().indexOf(employeTest);
        responsableMagasinTest.donnerDroit(employeTest);
        assertEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().get(indexTest).isAccesAppli());
    }

    @Test
    public final void testNommerChefRayon() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        Rayon rayonTest = new Rayon();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        Employe employeTest = new Employe(vendeurTest);
        responsableMagasinTest.getMagasin().getEmployes().add(employeTest);

        responsableMagasinTest.nommerChefRayon(employeTest, rayonTest);
        assertEquals(resultat, responsableMagasinTest.getMagasin().getChefsRayon().contains(employeTest));
        assertNotEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().contains(employeTest));

    }

    @Test
    public final void testDestituerChefRayon() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        Rayon rayonTest = new Rayon();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        ChefRayon chefRayonTest = new ChefRayon(vendeurTest, rayonTest);
        responsableMagasinTest.getMagasin().getChefsRayon().add(chefRayonTest);

        responsableMagasinTest.destituerChefRayon(chefRayonTest);
        assertEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().contains(vendeurTest));
        assertNotEquals(resultat, responsableMagasinTest.getMagasin().getChefsRayon().contains(chefRayonTest));
    }

    @Test
    public final void testChangerRayon() {
        Magasin magasinTest = new Magasin();
        Rayon rayonTestUn = new Rayon();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTestUn = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        ChefRayon chefRayonTest = new ChefRayon(vendeurTestUn, rayonTestUn);
        responsableMagasinTest.getMagasin().getChefsRayon().add(chefRayonTest);

        Rayon rayonTestDeux = new Rayon(null, "Rayon Deux", null);
        responsableMagasinTest.changerRayon(chefRayonTest, rayonTestDeux);
        assertSame(rayonTestDeux, chefRayonTest.getRayon());
        assertSame(chefRayonTest, rayonTestDeux.getChefRayon());
    }

    @Test
    public final void testModifierMail() {
        String mailTest = "mail.test@test.com";
        String resultat = mailTest;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        Employe employeTest = new Employe(vendeurTest);
        responsableMagasinTest.getMagasin().getEmployes().add(employeTest);

        int indexTest = responsableMagasinTest.getMagasin().getEmployes().indexOf(employeTest);
        responsableMagasinTest.modifierMail(employeTest, mailTest);
        assertSame(resultat, responsableMagasinTest.getMagasin().getEmployes().get(indexTest).getMail());
    }

    @Test
    public final void testModifierNomMagasin() {
        String nomMagasinTest = "nouveauMagasin";
        String resultat = nomMagasinTest;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        Vendeur vendeurTest = new Vendeur("Test", "Test", "test.test@test.com", "MagasinTest");
        Employe employeTest = new Employe(vendeurTest);
        responsableMagasinTest.getMagasin().getEmployes().add(employeTest);

        int indexTest = responsableMagasinTest.getMagasin().getEmployes().indexOf(employeTest);
        responsableMagasinTest.modifierNomMagasin(employeTest, nomMagasinTest);
        assertSame(resultat, responsableMagasinTest.getMagasin().getEmployes().get(indexTest).getNomMagasin());
    }
}

