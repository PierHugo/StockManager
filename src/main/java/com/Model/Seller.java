package Model;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.*;

@Entity
public class Seller
{
    @Column(name = "firstname")
    private StringProperty firstName;
    @Column(name = "lastname")
    private StringProperty lastName;
    @Id
    @Column(name = "mail")
    private StringProperty mail;
    @ManyToOne
    private Shop shop;
    @OneToOne
    private Department department;

    public Seller()
    {
    }

    public Seller(String firstNameParam, String lastNameParam, String mailParam, Shop shopParam, Department departmentParam)
    {
        this.firstName = new SimpleStringProperty(firstNameParam);
        this.lastName = new SimpleStringProperty(lastNameParam);
        this.mail = new SimpleStringProperty(mailParam);
        this.shop = shopParam;
        this.department = departmentParam;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }

    public Shop getShop()
    {
        return shop;
    }

    public void setShop(Shop shop)
    {
        this.shop = shop;
    }

    public String getFirstName()
    {
        return firstName.get();
    }

    public void setFirstName(String firstName)
    {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName()
    {
        return lastName.get();
    }

    public void setLastName(String lastName)
    {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getMail()
    {
        return mail.get();
    }

    public void setMail(String mail)
    {
        this.mail.set(mail);
    }

    public StringProperty mailProperty() {
        return mail;
    }

    public void addItem(Item itemParam)
    {
        department.getItems().add(itemParam);
    }

    public void removeItem(Item itemParam)
    {
        department.getItems().remove(itemParam);
    }

    public void editPrice(Item itemParam, double prixParam)
    {
        int index = department.getItems().indexOf(itemParam);
        department.getItems().get(index).setPrice(prixParam);
    }

    public void editQuantity(Item itemParam, int quantiteParam)
    {
        int index = department.getItems().indexOf(itemParam);
        department.getItems().get(index).setQuantity(quantiteParam);
    }

    public void editDepartment(Item itemParam, Department departmentParam)
    {
        int index = department.getItems().indexOf(itemParam);
        department.getItems().get(index).setDepartment(departmentParam);
    }
}
