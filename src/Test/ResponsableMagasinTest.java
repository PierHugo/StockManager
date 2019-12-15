package Test;

import static org.junit.Assert.*;

import Model.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ResponsableMagasinTest {
    private Personne responsableTest = new Personne("Test", "Osterone", "test.osterone@gmail.com", "MagasinTest");

    @Test
    public final void testAjouterEmploye() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        ArrayList<Employe> employesTest = new ArrayList<>();
        magasinTest.setEmployes(employesTest);
        Personne personneTest = new Personne("Test", "Test", "test.test@test.com", "Test");
        Employe employeTest = new Employe(personneTest);

        responsableMagasinTest.ajouterEmploye(employeTest);
       assertEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().contains(employeTest));

    }

    @Test
    public final void testSupprimerEmploye() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        ArrayList<Employe> employesTest = new ArrayList<>();
        magasinTest.setEmployes(employesTest);
        Personne personneTest = new Personne("Test", "Test", "test.test@test.com", "Test");
        Employe employeTest = new Employe(personneTest);
        employesTest.add(employeTest);

        responsableMagasinTest.supprimerEmploye(employeTest);
        assertNotEquals(resultat, responsableMagasinTest.getMagasin().getEmployes().contains(employeTest));
    }

    @Test
    public final void testAjouterChefRayon() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        Rayon rayonTest = new Rayon();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        ArrayList<ChefRayon> chefsRayonsTest = new ArrayList<>();
        magasinTest.setChefsRayon(chefsRayonsTest);
        Personne personneTest = new Personne("Test", "Test", "test.test@test.com", "Test");
        ChefRayon chefRayonTest = new ChefRayon(personneTest, rayonTest);

        responsableMagasinTest.ajouterChefRayon(chefRayonTest);
        assertEquals(resultat, responsableMagasinTest.getMagasin().getChefsRayon().contains(chefRayonTest));
    }

    @Test
    public final void testSupprimerChefRayon() {
        boolean resultat = true;
        Magasin magasinTest = new Magasin();
        Rayon rayonTest = new Rayon();
        ResponsableMagasin responsableMagasinTest = new ResponsableMagasin(responsableTest, magasinTest);
        ArrayList<ChefRayon> chefsRayonsTest = new ArrayList<>();
        magasinTest.setChefsRayon(chefsRayonsTest);
        Personne personneTest = new Personne("Test", "Test", "test.test@test.com", "Test");
        ChefRayon chefRayonTest = new ChefRayon(personneTest, rayonTest);
        chefsRayonsTest.add(chefRayonTest);

        responsableMagasinTest.supprimerChefRayon(chefRayonTest);
        assertNotEquals(resultat, responsableMagasinTest.getMagasin().getChefsRayon().contains(chefRayonTest));
    }

    @Test
    public final void testRevoquerDroit() {
        fail("not yet implemented");
    }

    @Test
    public final void testDonnerDroit() {
        fail("not yet implemented");
    }

    @Test
    public final void testNommerChefRayon() {
        fail("not yet implemented");
    }

    @Test
    public final void testDestituerChefRayon() {
        fail("not yet implemented");
    }

    @Test
    public final void testChangerRayon() {
        fail("not yet implemented");
    }

    @Test
    public final void testModifierMail() {
        fail("not yet implemented");
    }

    @Test
    public final void testModifierNomMagasin() {
        fail("not yet implemented");
    }
}

