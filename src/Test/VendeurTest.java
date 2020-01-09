package Test;

import Model.Article;
import Model.Rayon;
import Model.Vendeur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendeurTest {
    Rayon rayonTest = new Rayon ("RayonTest");
    Vendeur vendeurTest  = new Vendeur ("Piedloup", "Erwann", "epiedloup92@gmail.com", "MagasinTest", 0, rayonTest);

    @Test
    void ajouterArticle() {
        Article articleTest = new Article (5.00, "FFFF8", "Balle de Ping-Pong", 10, "RayonTest");

        vendeurTest.ajouterArticle(articleTest);
        assertTrue(vendeurTest.getRayon().getArticlesRayon().contains(articleTest));
    }

    @Test
    void supprimerArticle() {
        Article articleTest = new Article(3.26, "BGYI7", "Gants", 3, "RayonTest");
        vendeurTest.ajouterArticle(articleTest);

        vendeurTest.supprimerArticle(articleTest);
        assertFalse(vendeurTest.getRayon().getArticlesRayon().contains(articleTest));
    }

    @Test
    void modifierPrix() {
        double prixTest = 226.5;
        Article articleTest = new Article (22.65, "JHUY4", "Vélo B-Twin", 1, "RayonTest");
        vendeurTest.ajouterArticle(articleTest);
        int indexTest = vendeurTest.getRayon().getArticlesRayon().indexOf(articleTest);

        vendeurTest.modifierPrix(articleTest, 226.5);
        assertEquals(prixTest, vendeurTest.getRayon().getArticlesRayon().get(indexTest).getPrix());
    }

    @Test
    void modifierQuantite() {
        int quantiteTest = 50;
        Article articleTest = new Article(8.00, "ABCD5", "Chaussettes de Sport", 5, "RayonTest");
        vendeurTest.ajouterArticle(articleTest);
        int indexTest = vendeurTest.getRayon().getArticlesRayon().indexOf(articleTest);

        vendeurTest.modifierQuantite(articleTest, 50);
        assertEquals(quantiteTest, vendeurTest.getRayon().getArticlesRayon().get(indexTest).getQuantite());
    }

    @Test
    void modifierNomRayon() {
        String nomRayonTest = "Rayon Test 2";
        Article articleTest = new Article (15.00, "BALO2", "Ballon de Basket-ball", 22, "RayonTest");
        vendeurTest.ajouterArticle(articleTest);
        int indexTest = vendeurTest.getRayon().getArticlesRayon().indexOf(articleTest);

        vendeurTest.modifierNomRayon(articleTest, "Rayon Test 2");
        assertEquals(nomRayonTest, vendeurTest.getRayon().getArticlesRayon().get(indexTest).getNomRayon());
    }
}