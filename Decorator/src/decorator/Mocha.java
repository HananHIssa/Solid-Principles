
package decorator;

public class Mocha extends Decorator{
        Beverage beverage;
        
    public Mocha( Beverage beverage) {
       this.beverage=beverage;
    }

    
    @Override
    public String getDiscription() {
        return beverage.getDiscription()+"Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }
    
}
