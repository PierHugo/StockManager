package Model;

public class Item
{
    private double price;
    private String reference;
    private String name;
    private int quantity;
    private String departmentName;

    public Item(double priceParam, String referenceParam, String nameParam, int quantityParam, String departmentNameParam)
    {
        this.price = priceParam;
        this.reference = referenceParam;
        this.name = nameParam;
        this.quantity = quantityParam;
        this.departmentName = departmentNameParam;
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

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }
}
