
package student7;
import java.util.*;
public class main {
    public static void input(Student7 a[])
    {
        Scanner in=new Scanner(System.in);
        double grade ;
        String name;
        for(int i=0;i<a.length;i++)
        { name=in.next();
        a[i].setName(name);
        }
        for(int i=0;i<a.length;i++)
        { grade=in.nextDouble();
        a[i].setMark(grade);
        }
    }
    public static void main(String[]args)
    {
       Student7[]a=new Student7[4]; 
       int maxindex=0;double max=a[0].getMark();
       for(int i=1;i<a.length;i++)
       { if(a[i].getMark()>max)
               maxindex=i;
       max=a[i].getMark();
       }
       for(int i=0;i<a.length;i++)
           System.out.print(max);
       
    }
}
