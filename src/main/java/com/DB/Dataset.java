package DB;

import Model.*;

import javax.persistence.EntityManager;

public abstract class Dataset
{

    public static EntityManager em;

    public static void createDatas(EntityManager emparam) throws Exception
    {
        em = emparam;

        // Creation department
        em.getTransaction().begin();
        Department department1 = new Department("Football");
        Department department2 = new Department("Tennis");
        em.persist(department1);
        em.persist(department2);
        em.getTransaction().commit();

        // Creation item
        em.getTransaction().begin();
        Item item1 = new Item(2.5, "X01", "Balle de tennis", 15, department1);
        Item item2 = new Item(10, "X02", "Ballon de football", 30, department2);
        em.persist(item1);
        em.persist(item2);
        em.getTransaction().commit();

        // Creation shop
        em.getTransaction().begin();
        Shop shop1 = new Shop("Dé4");
        em.persist(shop1);
        em.getTransaction().commit();

        // Creation manager
        em.getTransaction().begin();
        Manager manager1 = new Manager("Jean", "Bon", "jeanbon@gmail.com", shop1);
        Manager manager2 = new Manager("Jacques", "Ouzzi", "jacquesouzzi@gmail.com", shop1);
        em.persist(manager1);
        em.persist(manager2);
        em.getTransaction().commit();

        // Creation seller
        em.getTransaction().begin();
        Seller seller1 = new Seller("Arthur", "Lupine", "arthurlupine@gmail.com", shop1, department1);
        Seller seller2 = new Seller("Gui", "Mauve", "guimauve@gmail.com", shop1, department2);
        em.persist(seller1);
        em.persist(seller2);
        em.getTransaction().commit();
    }
}
