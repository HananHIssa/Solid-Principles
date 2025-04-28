/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.interfacesegregationprinciple.InterfaceSegregationPrinciple;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class InterfaceSegregationPrincipleTest {
    
    public InterfaceSegregationPrincipleTest() {
    }
    @Test
    public void getNonVegetarianItemTest()
    {
        InterfaceSegregationPrinciple.NonVegetarianMenuClass menu=new InterfaceSegregationPrinciple.NonVegetarianMenuClass();
        List<String>NonVegetarianMenu=menu.getNonVegetarianItem();
        assertEquals(3,NonVegetarianMenu.size());
        assertEquals("Chicken Curry",NonVegetarianMenu.get(0));
        assertEquals("Fish Fry",NonVegetarianMenu.get(1));
        assertEquals("Mutton",NonVegetarianMenu.get(2));

    }
    @Test
    public void getVegetarianItemTest()
    {
        InterfaceSegregationPrinciple.VegetarianMenuClass menu=new InterfaceSegregationPrinciple.VegetarianMenuClass();
        List<String>NonVegetarianMenu=menu.getVegetarianItem();
        assertEquals(3,NonVegetarianMenu.size());
        assertEquals("Vegetable Curry",NonVegetarianMenu.get(0));
        assertEquals("Paneer Tikka",NonVegetarianMenu.get(1));
        assertEquals("Salad",NonVegetarianMenu.get(2));

    }
    @Test
    public void DrinkMenuTest() {
        InterfaceSegregationPrinciple.DrinkMenuClass drinkMenu = new InterfaceSegregationPrinciple.DrinkMenuClass();
        List<String> items = drinkMenu.getDrinkItem();

        assertEquals(3, items.size());
        assertEquals("water", items.get(0));
        assertEquals("soda", items.get(1));
        assertEquals("juice", items.get(2));
    }
    
}
