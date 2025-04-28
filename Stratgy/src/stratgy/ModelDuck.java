/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratgy;

/**
 *
 * @author hp
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flybehavior=new FlywithWings();
        quackBehavior =new Qack();
    }
    
}
