
package com.mycompany.liskovssubstitutionprincipleupdate;

public class LiskovSSubstitutionPrincipleUpdate {
public interface Shape{
public double calculateArea();
}
// Represents a Rectangle shape with height and width
public static class Rectangle implements Shape{
    private double height;
    private double width;

        public  Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return height*width;
        }
    }
// Represents a Square shape with height 
public static class Square implements Shape{
    private double height;

        public Square(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return height*height;
        }
}
// Represents a Circle shape with radius
public static class Circle implements Shape{
    private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
     
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return radius*radius*Math.PI;
        } 
}
// Represents a Triangle shape with height and base
public static class Triangle implements Shape{
    private double base;
    private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return .5*base*height;
        }
    
}
    public static void main(String[] args) {
        Shape rectangle=new Rectangle(5,10);
        Shape square=new Square(5);
        Shape circle=new Circle(2.6);
        Shape Triangle=new Triangle(2.8,4.6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Triangle Area: " + Triangle.calculateArea());

    }
    
}

