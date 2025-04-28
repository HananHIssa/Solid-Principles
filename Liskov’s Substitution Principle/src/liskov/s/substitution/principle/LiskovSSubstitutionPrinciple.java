
package liskov.s.substitution.principle;
public class LiskovSSubstitutionPrinciple {
public static class Rectangle {
     static double hight;
     static double width;
    public Rectangle(double hight,double width)
    {
        this.hight=hight;
        this.width=width;
    }

        public  double getHight() {
            return hight;
        }

        public  void setHight(double hight) {
            Rectangle.hight = hight;
        }

        public  double getWidth() {
            return width;
        }

        public  void setWidth(double width) {
            Rectangle.width = width;
        }
    
    public  double CalculateArea()
    {
        return hight*width;
    }
    }    
  public static class Square extends Rectangle {
    
        public Square(double hight) {
            super(hight, hight);
        }

        public  void setHight(double hight) {
            Rectangle.hight = hight;
        }

        public  void setWidth(double width) {
            Rectangle.width = hight;
        }
    
}
    public static void main(String[] args) {
        Rectangle rectangle=new Square(5);
        rectangle.setHight(10);
        rectangle.setWidth(5);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHight());
        System.out.println("Area: " + rectangle.CalculateArea());
    }
    
}
