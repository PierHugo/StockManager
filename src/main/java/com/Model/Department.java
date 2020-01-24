package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Item> items;
    @Column(name = "name")
    private String name;
    @ManyToOne
    private Seller seller;
    @ManyToOne
    private Shop shop;

    public Department()
    {
    }

    public Department(String nameParam)
    {
        items = new ArrayList<>();
        name = nameParam;
        id = 0;
    }

    public Department(List<Item> itemsParam, String nameParam, int idParam)
    {
        items = itemsParam;
        name = nameParam;
        id = idParam;
    }

    public List<Item> getItems()
    {
        return items;
    }

    public void setItems(List<Item> items)
    {
        this.items = items;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Seller getSeller()
    {
        return seller;
    }

    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }

    public Shop getShop()
    {
        return shop;
    }

    public void setShop(Shop shop)
    {
        this.shop = shop;
    }
}
