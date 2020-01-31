package DAO;

import Model.Department;
import Model.Seller;
import Model.Shop;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DAODepartment
{
    private static EntityManager em;
    private static String nomBase = "Department";

    public DAODepartment(EntityManager emparam)
    {
        em = emparam;
    }

    public static List<Department> getAllDepartments()
    {
        String queryString = "SELECT c FROM " + nomBase + " c";

        List<Department> results = em.createQuery(queryString).getResultList();

        return results;
    }

    public static List<Department> getDepartmentsFromShopName(Shop parameter)
    {
        String nomParam = "shop_name";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getDepartments());

        List<Department> results = query.getResultList();

        return results;
    }

    public static Department getDepartmentFromSellerMail(Seller parameter)
    {
        String nomParam = "seller_mail";

        String queryString = "SELECT c FROM " + nomBase + " c WHERE " + nomParam + " = :" + nomParam;
        Query query = em.createQuery(queryString);
        query.setParameter(nomParam, parameter.getDepartment());

        List<Department> results = query.getResultList();

        if (results.size() > 0)
            return results.get(0);
        else
            return null;
    }
}