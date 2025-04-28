
package simplefactor;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Pizza {
    String name,dough,sauce;
    ArrayList<String>toppings=new ArrayList<>();

    public String getName() {
        return name;
    }
    public void prepare()
    {
        System.out.print("Preparing "+name);
    }
    public void bake()
    {
        System.out.print("Baking "+name);
    }
    public void cut()
    {
        System.out.print("cut"+name);
    }
     public void box()
    {
        System.out.print("box"+name);
    }
     public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}
