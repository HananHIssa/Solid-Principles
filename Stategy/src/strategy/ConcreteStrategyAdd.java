
package strategy;
public class ConcreteStrategyAdd implements Stategy{

    @Override
    public int execute(int a, int b) {
       return a+b;
    }
    
}
