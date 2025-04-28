
package design.pattern.project;

public class BorderLightCommand implements Command{
    private Shape shape;
    
    public BorderLightCommand(Shape shape) {
        this.shape = shape;
    }
    
    @Override
    public void execute() {
        System.out.println("Executing Border Light Command for " + shape.getDescription());
    }
    
    
}
