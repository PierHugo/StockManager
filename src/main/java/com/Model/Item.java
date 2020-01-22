package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item
{
    @Column(name = "price")
    private double price;
    @Id
    @Column(name = "reference")
    private String reference;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @ManyToOne
    private Department department;

    public Item()
    {
    }

    public Item(double priceParam, String referenceParam, String nameParam, int quantityParam, Department departmentParam)
    {
        this.price = priceParam;
        this.reference = referenceParam;
        this.name = nameParam;
        this.quantity = quantityParam;
        this.department = departmentParam;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }
}
