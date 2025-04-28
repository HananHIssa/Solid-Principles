/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.project;

/**
 *
 * @author hp
 */
public class WindowsShapeFactory implements ShapeFactory{
 @Override
    public Shape CreateSquare() {
        return WindowsSquare.getInstance();
    }

    @Override
    public Shape CreateCircle() {
        return WindowsCircle.getInstance(); // Implement if needed
    }
    
}
