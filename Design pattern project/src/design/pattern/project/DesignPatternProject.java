package design.pattern.project;

public class DesignPatternProject {
    public static void main(String[] args) {
        // Create a Windows Square
        ShapeFactory windowsFactory = new WindowsShapeFactory();
        Shape windowsSquare = windowsFactory.CreateSquare();
        Shape decoratedWindowsSquare = new DoubleBorderSizeDecorator(new ColorFillDecorator(windowsSquare));
        decoratedWindowsSquare.draw();

        // Create a Linux Circle
        ShapeFactory linuxFactory = new LinuxShapeFactory();
        Shape linuxCircle = linuxFactory.CreateCircle();
        Shape decoratedLinuxCircle = new BorderDecorator(linuxCircle, "Red");
        decoratedLinuxCircle.draw();

        // Create a Windows Circle
        Shape windowsCircle = windowsFactory.CreateCircle();
        Shape decoratedWindowsCircle = new DoubleBorderSizeDecorator(new ColorFillDecorator(windowsCircle));
        decoratedWindowsCircle.draw();

        // Create a Linux Square
        Shape linuxSquare = linuxFactory.CreateSquare();
        Shape decoratedLinuxSquare = new BorderDecorator(linuxSquare, "Red");
        decoratedLinuxSquare.draw();
    }
}
