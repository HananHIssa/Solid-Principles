
package design.pattern.project;
public abstract class ShapeDecorator extends Shape {
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
    }
    
    @Override
    public String getDescription() {
        return decoratedShape.getDescription();
    }
}