
package simplefactor;

/**
 *
 * @author hp
 */
public class SimpleFactor {
public Pizza createPizaa(String type)
{
    Pizza pizza=null;
    if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
    return pizza;
    
}
    
}
