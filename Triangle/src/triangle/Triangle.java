
package triangle;
public class Triangle {
private int base;
private int height;
public Triangle(){ 
}
public Triangle(int base,int hight){
    this.base=base;
    this.height=height;
}
 public  void setBase(int base)
 {
     
 }
 public int getBase()
 {
     return base;
 }
  public  void setHeight(int base)
 {
     this.height=height;
 }
 public int getHeight()
 {
     return height;
 }
 public int getArea()
 {
    int area=base*height;
    return area;
 }
    public int getCircumferenceofacircle()
 {
     int circumferenceofacircle=base*height;
     return circumferenceofacircle;
 }
}
