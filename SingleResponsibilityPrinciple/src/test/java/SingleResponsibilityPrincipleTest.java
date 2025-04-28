

import com.mycompany.singleresponsibilityprinciple.SingleResponsibilityPrinciple;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleResponsibilityPrincipleTest {
    
    public SingleResponsibilityPrincipleTest() {
    }
    
    @Test
    public void testBreadBaker()
    {
        //Arrange
        SingleResponsibilityPrinciple.BreadBaker breadbaker=new SingleResponsibilityPrinciple.BreadBaker();
        //Assert
        assertEquals("Baking high-quality bread...",breadbaker.breadbaker());
    }
    @Test
    public void testManageInventory()
    {
        //Arrange
    SingleResponsibilityPrinciple.InventoryManager inventorymanager=new SingleResponsibilityPrinciple.InventoryManager();
       //assert
       assertEquals("Managing inventory",inventorymanager.manageInventory());
    }
    @Test
    public void testcleanBakery()
    {
        //Arrange
    SingleResponsibilityPrinciple.BakeryCleaner cleanBakery=new SingleResponsibilityPrinciple.BakeryCleaner();
       //assert
       assertEquals("Cleaning the bakery...",cleanBakery.cleanBakery());
    }
    @Test
    public void testServerCustomer()
    {
        //Arrange
    SingleResponsibilityPrinciple.CustomerService serverCustomer=new SingleResponsibilityPrinciple.CustomerService();
       //assert
       assertEquals("Serving customers...",serverCustomer.serverCustomer());
    }
    @Test
    public void testOrderSupplies()
    {
        //Arrange
    SingleResponsibilityPrinciple.SupplyOrder ordersupplies=new SingleResponsibilityPrinciple.SupplyOrder();
       //assert
       assertEquals("Ordering supplies...",ordersupplies.ordersupplies());
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SingleResponsibilityPrinciple.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
