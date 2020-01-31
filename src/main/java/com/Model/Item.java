package Model;

import javafx.beans.property.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item
{
    @Column(name = "price")
    private DoubleProperty price;
    @Id
    @Column(name = "reference")
    private StringProperty reference;
    @Column(name = "name")
    private StringProperty name;
    @Column(name = "quantity")
    private IntegerProperty quantity;
    @ManyToOne
    private Department department;

    public Item()
    {
    }

    public Item(double priceParam, String referenceParam, String nameParam, int quantityParam, Department departmentParam)
    {
        this.price = new SimpleDoubleProperty(priceParam);
        this.reference = new SimpleStringProperty(referenceParam);
        this.name = new SimpleStringProperty(nameParam);
        this.quantity = new SimpleIntegerProperty(quantityParam);
        this.department = departmentParam;
    }

    public double getPrice()
    {
        return price.get();
    }

    public void setPrice(double price)
    {
        this.price.set(price);
    }

    public DoubleProperty priceProperty() {
        return price;
    }

    public String getReference()
    {
        return reference.get();
    }

    public void setReference(String reference)
    {
        this.reference.set(reference);
    }

    public StringProperty referenceProperty() {
        return reference;
    }

    public String getName()
    {
        return name.get();
    }

    public void setName(String name)
    {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public int getQuantity()
    {
        return quantity.get();
    }

    public void setQuantity(int quantity)
    {
        this.quantity.set(quantity);
    }

    public IntegerProperty quantityProperty() {
        return quantity;
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
