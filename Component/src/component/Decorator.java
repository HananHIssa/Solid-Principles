/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

/**
 *
 * @author hp
 */
public abstract class Decorator implements Component{
    protected Component component;
    public Decorator(Component component)
    {
        this.component= component;
    }
   
    @Override
    public void operation() {
    }
    
}
