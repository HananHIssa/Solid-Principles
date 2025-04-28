
package duck;

/**
 *
 * @author hp
 */
public class MallerdDuck extends Duck{

    public MallerdDuck() {
        flybehavior=new FlyNoWay();
        quackbehavior=new MuteQuack();
    }

    
    @Override
    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
