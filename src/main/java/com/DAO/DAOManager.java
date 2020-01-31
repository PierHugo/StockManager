package DAO;

import Model.Manager;
import Model.Shop;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOManager
{
    private static EntityManager em;
    private static String nomBase = "Manager";

    public DAOManager(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Manager> getAllManagers()
    {
        String queryString = "SELECT c FROM " + nomBase + " c";

        List<Manager> results = em.createQuery(queryString).getResultList();

        return results;
    }

    public static Manager getManagerFromShopName(Shop parameter)
    {
        String nomParam = "shop_name";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getManager());

        List<Manager> results = query.getResultList();
        if (results.size() > 0)
            return results.get(0);
        else
            return null;
    }
}