
package student0;
public class Student0 {
private String name;
private double avg;
private static int contofstud;
public Student0()
        {
            contofstud++;
        }
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name=name;
}
public double getAvg()
{
    return avg;
}
public void setAvg(double avg)
{
    this.avg=avg;
}
public static int getContofstud()
{
    return contofstud;
}
   
    
}
