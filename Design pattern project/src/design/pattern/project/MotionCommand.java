
package design.pattern.project;
public class MotionCommand implements Command{
  
   private Shape shape;
    
    public MotionCommand(Shape shape) {
        this.shape = shape;
    }
    
    @Override
    public void execute() {
        System.out.println("Executing Motion Command for " + shape.getDescription());
    }
}
