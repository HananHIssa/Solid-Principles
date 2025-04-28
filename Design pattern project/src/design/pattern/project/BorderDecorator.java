
package design.pattern.project;
public class BorderDecorator extends ShapeDecorator {
 private String borderColor;

    public BorderDecorator(Shape decoratedShape, String borderColor) {
        super(decoratedShape);
        this.borderColor = borderColor;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorderColor(decoratedShape);
    }

    private void setBorderColor(Shape decoratedShape) {
        System.out.println("Border color: " + borderColor);
    }

    @Override
    public String getDescription() {
        return decoratedShape.getDescription() + ", with a border color of " + borderColor;
    }
}   

