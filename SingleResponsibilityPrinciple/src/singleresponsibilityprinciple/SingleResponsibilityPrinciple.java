
package singleresponsibilityprinciple;
public class SingleResponsibilityPrinciple {
public static class BreadBaker {
    public void breadbaker ()
    {
        System.out.println("Baking high-quality bread..." );
    }
}  
public static class InventoryManager {
  public void manageInventory()
  {
      System.out.println("Managing inventory");
  }
}
public static class CustomerService {
    public void serverCustomer()
    {
        System.out.println("Serving customers...");
    }
}
public static class  SupplyOrder {
   public void ordersupplies()
   {
     System.out.println("Ordering supplies...");
   }
}
public static class BakeryCleaner {
   public void cleanBakery()
   {
       System.out.println("Cleaning the bakery...");
   }
}
    public static void main(String[] args) {
       BreadBaker baker = new BreadBaker() ;
       InventoryManager inventorymanager=new InventoryManager();
       CustomerService servercustomer=new CustomerService();
       BakeryCleaner cleaner=new BakeryCleaner();
       SupplyOrder supplyorder=new SupplyOrder();
  // Each class focuses on its specific responsibility
       baker.breadbaker();
       inventorymanager.manageInventory();
       servercustomer.serverCustomer();
       cleaner.cleanBakery();
       supplyorder.ordersupplies();
              
    }
    
}
