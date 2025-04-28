/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.liskovssubstitutionprincipleupdate.LiskovSSubstitutionPrincipleUpdate;
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

    public class LiskovSSubstitutionPrincipleUpdateTest {
    
    public LiskovSSubstitutionPrincipleUpdateTest() {
    }
    @Test
    public void testRectangleArea()
    {
        //Arrange
       LiskovSSubstitutionPrincipleUpdate.Rectangle rectangle=new LiskovSSubstitutionPrincipleUpdate.Rectangle(5,10);
       //Act
       double actualArea=rectangle.calculateArea();
       //Assert
       assertEquals(50.0,actualArea,0.0001);
    }
    @Test
    public void testSquareArea()
    {
        //Arrange
        LiskovSSubstitutionPrincipleUpdate.Square square=new LiskovSSubstitutionPrincipleUpdate.Square(10);
        //Act
        double actualArea=square.calculateArea();
        //Assert
        assertEquals(100.0,actualArea,.0001);
    }
    @Test
    public void testCircleArea()
    {
     //Arrange
    LiskovSSubstitutionPrincipleUpdate.Circle circle=new LiskovSSubstitutionPrincipleUpdate.Circle(10);
     //Act
     double actualArea=circle.calculateArea();
     //Assert
     assertEquals(314.1592653589793,actualArea,.0001);
    }
    @Test
    public void testTriangleArea()
    {
     //Arrange
    LiskovSSubstitutionPrincipleUpdate.Triangle triangle=new LiskovSSubstitutionPrincipleUpdate.Triangle(10,20);
     //Act
     double actualArea=triangle.calculateArea();
     //Assert
     assertEquals(100.0,actualArea,.0001);
    }
    
    }
