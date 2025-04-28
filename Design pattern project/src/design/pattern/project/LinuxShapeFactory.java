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
public class LinuxShapeFactory implements ShapeFactory{

    public Shape CreateSquare() {
        return LinuxSquare.getInstance(); // Implement if needed
    }

    @Override
    public Shape CreateCircle() {
        return LinuxCircle.getInstance();
    }
    
}
