
package student7;
public class Student7 {
private String name;
private double mark;
private static int contofstud;
public Student7()
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
public void setMark(double mark)
{
    this.mark=mark;
}
    public double getMark()
    {
        return mark;
    }
}
