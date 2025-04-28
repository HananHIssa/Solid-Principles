
package strategy;
public class ExampleApplication {
 public static void main(String [] args)
 {
     Context context=new Context();
     int f=10,s=12;
     String action ="addition";
     if(action=="addition")
         context.setStratgy((Strategy) new ConcreteStrategyAdd());
     else if (action=="subtraction")
                  context.setStratgy((Strategy) new ConcreteStrategySubtract());
     else if (action=="multi")
                  context.setStratgy((Strategy) new ConcreteStrategyMultiply());
     int res=context.executeStrategy(f, s);
     System.out.print(res);
 }
}
