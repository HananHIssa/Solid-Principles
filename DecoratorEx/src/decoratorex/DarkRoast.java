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
public class DarkRoast extends Beverge{

    public DarkRoast() {
        Description="DarkRoast ";
    }

    @Override
    public double cost() {
       return 4.3;
    }
    
}
