
package employee;

public class Main {
    public static void main(String[]args)
    {
        Employee e=new Employee();
        e.setName("dj");
        e.setAge(19);
        e.setSalary(1990);
        System.out.println( "Age"+e.getAge()+" "+e.getName()+" "+"salary"+e.getSalary());
    }
}
