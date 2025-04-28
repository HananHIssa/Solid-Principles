/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorex;

/**
 *
 * @author hp
 */
public class DecoratorEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  Beverge DarkRoast=new DarkRoast();
       DarkRoast=new Mocha(DarkRoast);
       DarkRoast=new Mocha(DarkRoast);
       DarkRoast=new Whip(DarkRoast);
       System.out.print(DarkRoast.getDescription()+"$"+DarkRoast.cost());*/
     Beverge houseBlend=new HouseBlend();
     houseBlend=new Mocha(houseBlend);
     houseBlend=new Whip(houseBlend);
      System.out.print(houseBlend.getDescription()+"$"+houseBlend.cost());
    }
    
}
