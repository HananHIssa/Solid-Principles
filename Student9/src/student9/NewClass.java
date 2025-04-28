
package student9;
import java.util.*;
public class NewClass {
    public static void main()
    {
        Student9 s[]=new Student9[3];
        Scanner in=new Scanner(System.in);
          String k;
          String specialisation;
        for (Student9 item : s) {
            k=in.next();
            item.setName(k);
        }
        for (Student9 item : s) {
            specialisation=in.next();
            item.set(specialisation);
        }
        for (Student9 item : s) {
            System.out.println(item.getName() + item.getspecialisation());   
        }
    }
}
