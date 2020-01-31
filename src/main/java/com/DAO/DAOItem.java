package DAO;

import Model.Item;
import Model.Shop;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAOItem
{
    private static EntityManager em;
    private static String nomBase = "Item";

    public DAOItem(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Item> getAllItems()
    {
        String queryString = "SELECT c FROM " + nomBase + " c";

        List<Item> results = em.createQuery(queryString).getResultList();

        return results;
    }

    public static List<Item> getItemsFromDepartmentId(Shop parameter)
    {
        String nomParam = "department_id";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getDepartments());

        List<Item> results = query.getResultList();

        return results;
    }
}
