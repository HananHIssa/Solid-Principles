
package javaapplication7;
import java.util.*;
public class JavaApplication7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      for(int i=0;i<t;i++)
      { String s=in.next();
      int l=s.length();
      if(l>10)
      {
         s=s.charAt(0)+""+(l-2)+ s.charAt(l-1);
                   System.out.println(s);

      }
      else
          System.out.println(s);
   

        }
    }
    
}
