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
public class Whip extends Decoretor{
    Beverge beverge;

    public Whip(Beverge beverge) {
        this.beverge = beverge;
    }
    
    @Override
    public String getDescription() {
       return beverge.getDescription()+" Whip";
    }

    @Override
    public double cost() {
       return .88+beverge.cost();
    }
    
}
