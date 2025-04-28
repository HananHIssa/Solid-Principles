
package liskov.ssubstitutionprincipleupdate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
