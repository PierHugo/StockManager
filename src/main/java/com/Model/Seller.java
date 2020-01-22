package Model;

import javax.persistence.*;

@Entity
public class Seller
{
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Id
    @Column(name = "mail")
    private String mail;
    @ManyToOne
    private Shop shop;
    @OneToOne
    private Department department;

    public Seller()
    {
    }

    public Seller(String firstNameParam, String lastNameParam, String mailParam, Shop shopParam, Department departmentParam)
    {
        firstName = firstNameParam;
        lastName = lastNameParam;
        mail = mailParam;
        shop = shopParam;
        department = departmentParam;
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
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getMail()
    {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
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
