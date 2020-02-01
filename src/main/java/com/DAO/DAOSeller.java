package DAO;

import Model.Department;
import Model.Seller;
import Model.Shop;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOSeller
{
    private static EntityManager em;
    private static String nomBase = "Seller";

    public DAOSeller(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Seller> getAllSellers()
    {
        String queryString = "SELECT c FROM " + nomBase + " c";

        List<Seller> results = em.createQuery(queryString).getResultList();

       return results;
       // return em.createQuery("SELECT e FROM " + nomBase + " e").getResultList();
    }

    public static List<Seller> getSellersFromShopName(Shop parameter)
    {
        String nomParam = "shop_name";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getSellers());

        List<Seller> results = query.getResultList();

        return results;
    }

    public static Seller getSellerFromDepartmentId(Department parameter)
    {
        String nomParam = "department_id";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getSeller());

        List<Seller> results = query.getResultList();

        if (results.size() > 0)
            return results.get(0);
        else
            return null;
    }
}