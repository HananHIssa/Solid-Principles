
package design.pattern.project;

public class DoubleBorderSizeDecorator extends ShapeDecorator {
    public DoubleBorderSizeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        doubleBorderSize(decoratedShape);
    }

    private void doubleBorderSize(Shape decoratedShape) {
        System.out.println("Border size doubled");
    }

    @Override
    public String getDescription() {
        return decoratedShape.getDescription() + ", with double border size";
    }
}
