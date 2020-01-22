package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shop
{
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shop")
    private List<Department> departments;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shop")
    private List<Seller> sellers;
    @Id
    @Column(name = "name")
    private String name;
    @OneToOne
    private Manager manager;

    public Shop()
    {
    }

    public Shop(String nameParam)
    {
        departments = new ArrayList<>();
        sellers = new ArrayList<>();
        name = nameParam;
    }

    public Shop(String nameParam, Manager managerParam)
    {
        departments = new ArrayList<>();
        sellers = new ArrayList<>();
        name = nameParam;
        manager = managerParam;
    }

    public Shop(List<Item> itemsParam, List<Department> departmentsParam, List<Seller> sellersParam, String nameParam, Manager managerParam)
    {
        departments = departmentsParam;
        sellers = sellersParam;
        name = nameParam;
        manager = managerParam;
    }

    public List<Department> getDepartments()
    {
        return departments;
    }

    public void setDepartments(List<Department> departments)
    {
        this.departments = departments;
    }

    public List<Seller> getSellers()
    {
        return sellers;
    }

    public void setSellers(List<Seller> sellers)
    {
        this.sellers = sellers;
    }

    public Manager getManager()
    {
        return manager;
    }

    public void setManager(Manager manager)
    {
        this.manager = manager;
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
