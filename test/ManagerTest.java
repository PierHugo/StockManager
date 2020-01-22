import Model.Department;
import Model.Manager;
import Model.Seller;
import Model.Shop;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest
{
    Shop shopTest = new Shop("ShopTest", null);
    Manager managerTest = new Manager("Erwann", "Piedloup", "erwann.piedloup@mail.com", shopTest);

    @org.junit.jupiter.api.Test
    void addSeller()
    {
        Seller sellerTest = new Seller("Genty", "Morgane", "morgane.genty@mail.com", shopTest, null);

        managerTest.addSeller(sellerTest);
        assertTrue(managerTest.getShop().getSellers().contains(sellerTest));
    }

    @org.junit.jupiter.api.Test
    void removeSeller()
    {
        Seller sellerTest = new Seller("Genty", "Morgane", "morgane.genty@mail.com", shopTest, null);
        managerTest.addSeller(sellerTest);

        managerTest.removeSeller(sellerTest);
        assertFalse(managerTest.getShop().getSellers().contains(sellerTest));
    }

    @org.junit.jupiter.api.Test
    void editDepartment()
    {
        Seller sellerTest = new Seller("Genty", "Morgane", "morgane.genty@mail.com", shopTest, null);
        Department departmentTest = new Department(null, "Department Test", 1);
        managerTest.addSeller(sellerTest);

        managerTest.editDepartment(sellerTest, departmentTest);
        assertEquals(departmentTest, sellerTest.getDepartment());
    }

    @org.junit.jupiter.api.Test
    void editMail()
    {
        Seller sellerTest = new Seller("Genty", "Morgane", "morgane.genty@mail.com", shopTest, null);
        String mailTest = "morgane.genty@mail2.com";
        managerTest.addSeller(sellerTest);

        managerTest.editMail(sellerTest, mailTest);
        assertEquals(mailTest, sellerTest.getMail());
    }

    @org.junit.jupiter.api.Test
    void editShopName()
    {
        Seller sellerTest = new Seller("Genty", "Morgane", "morgane.genty@mail.com", shopTest, null);
        String nomShopTest = "ShopTest2";
        managerTest.addSeller(sellerTest);

        managerTest.editShop(sellerTest, shopTest);
        assertEquals(nomShopTest, sellerTest.getShop());
    }
}