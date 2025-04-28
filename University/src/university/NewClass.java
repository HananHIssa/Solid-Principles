
package university;import java.util.*;
public class NewClass {
    public static void main(String [] args)
    {
        University[]s=new University[4];
        String name;
        String specialty;
        int age;
        Scanner in=new Scanner(System.in); System.out.println("Enter Name:");
        for(int i=0;i<s.length;i++)
        { s[i]=new University();
       
            name=in.next();
            s[i].setTeachername(name);}
              System.out.println("Enter :specialty");
              for(int i=0;i<s.length;i++)
        {   specialty=in.next();
            s[i].setspecialty(specialty);}
              System.out.println("Enter :age");
        for(int i=0;i<s.length;i++)
        {
            age=in.nextInt();
            s[i].setAge(age);
        }
       for(int i=0;i<s.length;i++)
           System.out.println("Age"+" "+s[i].getAge()+"Name"+" "+s[i].getTeachername()+"specialty "+s[i].getspecialty());
    }
}
