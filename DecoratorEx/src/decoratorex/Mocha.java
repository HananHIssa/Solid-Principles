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
public class Mocha extends Decoretor{
    Beverge beverge;

    public Mocha(Beverge beverge) {
        this.beverge = beverge;
    }
    @Override
    public String getDescription() {
       return beverge.getDescription()+" MOCHA";
    }

    @Override
    public double cost() {
        return beverge.cost()+ .66;
    }
    
}
