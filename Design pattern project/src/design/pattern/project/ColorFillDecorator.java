
package design.pattern.project;
public class ColorFillDecorator extends ShapeDecorator{
    public ColorFillDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    public void draw() {
        decoratedShape.draw();
        System.out.println("Filled with color");
    }
}
