
package ;
public class Friends {
private String name;
private int age;
private static int num;
public Friends()
{
    num++;
}
public void setName(String name)  
{
    this.name=name;
}
public String getName(){return name;}
public void setAge(int age)  
{
    this.age=age;
}
public int getAge(){return age;}
}
