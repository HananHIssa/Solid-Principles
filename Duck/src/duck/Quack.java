
package duck;

/**
 *
 * @author hp
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.print("Qack");
    }
    
}
