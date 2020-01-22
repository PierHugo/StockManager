import Model.Department;
import Model.Item;
import Model.Seller;
import Model.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellerTest
{
    Department departmentTest = new Department("DepartmentTest");
    Shop shopTest = new Shop("ShopTest");
    Seller sellerTest = new Seller("Piedloup", "Erwann", "epiedloup92@gmail.com", shopTest, departmentTest);

    @Test
    void addItem()
    {
        Department departmentTest = new Department("DepartmentTest");
        Item itemTest = new Item(5.00, "FFFF8", "Balle de Ping-Pong", 10, departmentTest);

        sellerTest.addItem(itemTest);
        assertTrue(sellerTest.getDepartment().getItems().contains(itemTest));
    }

    @Test
    void removeItem()
    {
        Department departmentTest = new Department("DepartmentTest");
        Item itemTest = new Item(3.26, "BGYI7", "Gants", 3, departmentTest);
        sellerTest.addItem(itemTest);

        sellerTest.removeItem(itemTest);
        assertFalse(sellerTest.getDepartment().getItems().contains(itemTest));
    }

    @Test
    void editPrice()
    {
        Department departmentTest = new Department("DepartmentTest");
        double priceTest = 226.5;
        Item itemTest = new Item(22.65, "JHUY4", "Vélo B-Twin", 1, departmentTest);
        sellerTest.addItem(itemTest);
        int indexTest = sellerTest.getDepartment().getItems().indexOf(itemTest);

        sellerTest.editPrice(itemTest, 226.5);
        assertEquals(priceTest, sellerTest.getDepartment().getItems().get(indexTest).getPrice());
    }

    @Test
    void editQuantity()
    {
        Department departmentTest = new Department("DepartmentTest");
        int quantityTest = 50;
        Item itemTest = new Item(8.00, "ABCD5", "Chaussettes de Sport", 5, departmentTest);
        sellerTest.addItem(itemTest);
        int indexTest = sellerTest.getDepartment().getItems().indexOf(itemTest);

        sellerTest.editQuantity(itemTest, 50);
        assertEquals(quantityTest, sellerTest.getDepartment().getItems().get(indexTest).getQuantity());
    }

    @Test
    void editDepartmentName()
    {
        Department departmentTest = new Department("DepartmentTest");
        Item itemTest = new Item(15.00, "BALO2", "Ballon de Basket-ball", 22, departmentTest);
        sellerTest.addItem(itemTest);
        int indexTest = sellerTest.getDepartment().getItems().indexOf(itemTest);

        sellerTest.editDepartment(itemTest, departmentTest);
        assertEquals(departmentTest, sellerTest.getDepartment().getItems().get(indexTest).getDepartment());
    }
}