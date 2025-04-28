
package pkginterface.segregation.principle;

import java.util.ArrayList;
import java.util.List;

public class InterfaceSegregationPrinciple {
public interface VegetarianMenu{
    List<String>getVegetarianItem();
}
public interface NonVegetarianMenu{
    List<String>getNonVegetarianItem();

}
public interface DrinkMenu{
    List<String>getDrinkItem();
}
public static class VegetarianMenuClass implements VegetarianMenu{

        @Override
        public List<String> getVegetarianItem() {
            List<String>VegetarianItem=new ArrayList();
            VegetarianItem.add("Vegetable Curry");
            VegetarianItem.add("Paneer Tikka");
            VegetarianItem.add("Salad"); 
            return VegetarianItem;
        }
}
public static class NonVegetarianMenuClass implements NonVegetarianMenu{

        @Override
        public List<String> getNonVegetarianItem() {
            List<String>NonVegetarianItem=new ArrayList();
            NonVegetarianItem.add("Chicken Curry");
            NonVegetarianItem.add("Fish Fry");
            NonVegetarianItem.add("Mutton");
            return NonVegetarianItem;
        }
}
public static class DrinkMenuClass implements DrinkMenu{

        @Override
            public List<String> getDrinkItem() {
            List<String>DrinkItem=new ArrayList();
            DrinkItem.add("water");
            DrinkItem.add("soda");
            DrinkItem.add("juice"); 
            return DrinkItem;
        }
}
public static void displayNonVegetarianMenu(NonVegetarianMenu menu)
{
    System.out.println("Non-Vegetarian Menu:");
    for(String item:menu.getNonVegetarianItem())
    {
       System.out.println("- " + item);
    }
}
    public static void main(String[] args) {
      NonVegetarianMenuClass nonVegMenu = new NonVegetarianMenuClass();
      displayNonVegetarianMenu(nonVegMenu);

    }
    
}
