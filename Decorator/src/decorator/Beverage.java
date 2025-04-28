
package decorator;
public abstract class Beverage {
    public String Discription ="Unknown Beverage";
    public String getDiscription()
    {
        return Discription;
    }
    public abstract double cost();
}
