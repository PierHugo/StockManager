import Model.Department;
import Model.Item;
import Model.Seller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellerTest
{
    Department departmentTest = new Department("DepartmentTest");
    Seller sellerTest = new Seller("Piedloup", "Erwann", "epiedloup92@gmail.com", "MagasinTest", 0, departmentTest);

    @Test
    void addItem()
    {
        Item itemTest = new Item(5.00, "FFFF8", "Balle de Ping-Pong", 10, "DepartmentTest");

        sellerTest.addItem(itemTest);
        assertTrue(sellerTest.getDepartment().getItems().contains(itemTest));
    }

    @Test
    void removeItem()
    {
        Item itemTest = new Item(3.26, "BGYI7", "Gants", 3, "DepartmentTest");
        sellerTest.addItem(itemTest);

        sellerTest.removeItem(itemTest);
        assertFalse(sellerTest.getDepartment().getItems().contains(itemTest));
    }

    @Test
    void editPrice()
    {
        double priceTest = 226.5;
        Item itemTest = new Item(22.65, "JHUY4", "Vélo B-Twin", 1, "DepartmentTest");
        sellerTest.addItem(itemTest);
        int indexTest = sellerTest.getDepartment().getItems().indexOf(itemTest);

        sellerTest.editPrice(itemTest, 226.5);
        assertEquals(priceTest, sellerTest.getDepartment().getItems().get(indexTest).getPrice());
    }

    @Test
    void editQuantity()
    {
        int quantityTest = 50;
        Item itemTest = new Item(8.00, "ABCD5", "Chaussettes de Sport", 5, "DepartmentTest");
        sellerTest.addItem(itemTest);
        int indexTest = sellerTest.getDepartment().getItems().indexOf(itemTest);

        sellerTest.editQuantity(itemTest, 50);
        assertEquals(quantityTest, sellerTest.getDepartment().getItems().get(indexTest).getQuantity());
    }

    @Test
    void editDepartmentName()
    {
        String nameDepartmentTest = "Department Test 2";
        Item itemTest = new Item(15.00, "BALO2", "Ballon de Basket-ball", 22, "DepartmentTest");
        sellerTest.addItem(itemTest);
        int indexTest = sellerTest.getDepartment().getItems().indexOf(itemTest);

        sellerTest.editDepartmentName(itemTest, "Department Test 2");
        assertEquals(nameDepartmentTest, sellerTest.getDepartment().getItems().get(indexTest).getDepartmentName());
    }
}