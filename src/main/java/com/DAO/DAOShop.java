package DAO;

import Model.Manager;
import Model.Shop;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOShop
{
    private static EntityManager em;
    private static String nomBase = "Shop";

    public DAOShop(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Shop> getAllShops()
    {
        String queryString = "SELECT c FROM " + nomBase + " c";

        List<Shop> results = em.createQuery(queryString).getResultList();

        return results;
    }

    public static Shop getShopFromManagerMail(Manager parameter)
    {
        String nomParam = "manager_mail";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getShop());

        List<Shop> results = query.getResultList();

        if (results.size() > 0)
            return results.get(0);
        else
            return null;
    }
}