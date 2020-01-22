package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Manager
{
    @Column(name = "isadmin")
    private boolean isAdmin;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Id
    @Column(name = "mail")
    private String mail;
    @OneToOne
    private Shop shop;

    public Manager()
    {
    }

    public Manager(String firstNameParam, String lastNameParam, String mailParam, Shop shopParam)
    {
        isAdmin = true;
        firstName = firstNameParam;
        lastName = lastNameParam;
        mail = mailParam;
        shop = shopParam;
    }

    public boolean isAdmin()
    {
        return isAdmin;
    }

    public void setAdmin(boolean admin)
    {
        isAdmin = admin;
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

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getMail()
    {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }

    public Shop getShop()
    {
        return shop;
    }

    public void setShop(Shop shop)
    {
        this.shop = shop;
    }

    //TODO : Faire les méthodes pour ajouter, modifier, supprimer un employé d'un magasin.

    public void addSeller(Seller sellerParam)
    {
        shop.getSellers().add(sellerParam);
    }

    public void removeSeller(Seller sellerParam)
    {
        shop.getSellers().remove(sellerParam);
    }

    public void editDepartment(Seller sellerParam, Department departmentParam)
    {
        int index = shop.getSellers().indexOf(sellerParam);
        shop.getSellers().get(index).setDepartment(departmentParam);
    }

    public void editMail(Seller sellerParam, String mailParam)
    {
        int index = shop.getSellers().indexOf(sellerParam);
        shop.getSellers().get(index).setMail(mailParam);
    }

    public void editShop(Seller sellerParam, Shop ShopParam)
    {
        int index = shop.getSellers().indexOf(sellerParam);
        shop.getSellers().get(index).setShop(ShopParam);
    }

}