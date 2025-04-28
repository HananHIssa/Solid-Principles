package com.mycompany.singleresponsibilityprinciple;

public class SingleResponsibilityPrinciple {

    public static class BreadBaker {
        public String breadbaker() {
            return "Baking high-quality bread...";
        }
    }

    public static class InventoryManager {
        public String manageInventory() {
            return "Managing inventory";
        }
    }

    public static class CustomerService {
        public String serverCustomer() {
            return "Serving customers...";
        }
    }

    public static class SupplyOrder {
        public String ordersupplies() {
            return "Ordering supplies...";
        }
    }

    public static class BakeryCleaner {
        public String cleanBakery() {
            return "Cleaning the bakery...";
        }
    }

    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        InventoryManager inventoryManager = new InventoryManager();
        CustomerService customerService = new CustomerService();
        BakeryCleaner cleaner = new BakeryCleaner();
        SupplyOrder supplyOrder = new SupplyOrder();

        // Each class focuses on its specific responsibility
        System.out.println(baker.breadbaker());
        System.out.println(inventoryManager.manageInventory());
        System.out.println(customerService.serverCustomer());
        System.out.println(cleaner.cleanBakery());
        System.out.println(supplyOrder.ordersupplies());
    }
}