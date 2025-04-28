
package employee;

public class Employee {

   private String name;
   private int salary;
   private int age;
    public Employee()
    {
        
    }
    public void setName(String n)
    {
        if(n.length()<3)
            System.out.println("Your name should be more than 3");
        else
            name=n;
    }
    public String getName()
    {
        return "Name:"+name;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
}
