package Model;

public class Seller
{
    private String firstName;
    private String lastName;
    private String mail;
    private String shopName;
    private int departmentId;
    private Department department;

    public Seller(String fistNameParam, String lastNameParam, String mailParam, String shopNameParam, int departmentIdParam, Department departmentParam)
    {
        firstName = fistNameParam;
        lastName = lastNameParam;
        mail = mailParam;
        shopName = shopNameParam;
        departmentId = departmentIdParam;
        department = departmentParam;
    }

    public int getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(int departmentId)
    {
        this.departmentId = departmentId;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(String shopName)
    {
        this.shopName = shopName;
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

    public void editDepartmentName(Item itemParam, String departmentNameParam)
    {
        int index = department.getItems().indexOf(itemParam);
        department.getItems().get(index).setDepartmentName(departmentNameParam);
    }
}
