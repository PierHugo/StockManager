package Model;

import java.util.ArrayList;

public class Shop
{
    private ArrayList<Item> items;
    private ArrayList<Department> departments;
    private ArrayList<Seller> sellers;
    private String name;
    private String managerName;


    public Shop(String nameParam, String managerNameParam)
    {
        items = new ArrayList<>();
        departments = new ArrayList<>();
        sellers = new ArrayList<>();
        name = nameParam;
        managerName = managerNameParam;
    }

    public Shop(ArrayList<Item> itemsParam, ArrayList<Department> departmentsParam, ArrayList<Seller> sellersParam, String nameParam, String managerNameParam)
    {
        items = itemsParam;
        departments = departmentsParam;
        sellers = sellersParam;
        name = nameParam;
        managerName = managerNameParam;
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }

    public void setItems(ArrayList<Item> items)
    {
        this.items = items;
    }

    public ArrayList<Department> getDepartments()
    {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments)
    {
        this.departments = departments;
    }

    public ArrayList<Seller> getSellers()
    {
        return sellers;
    }

    public void setSellers(ArrayList<Seller> sellers)
    {
        this.sellers = sellers;
    }

    public String getManagerName()
    {
        return managerName;
    }

    public void setManagerName(String managerName)
    {
        this.managerName = managerName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
