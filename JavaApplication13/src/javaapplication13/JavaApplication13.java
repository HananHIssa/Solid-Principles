
package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {
    
    public static void main(String[] args) {
       Scanner st=new Scanner(System.in);
               String s=st.nextLine();int c=0,p=1;
               String se=st.nextLine();int j;
               if(s.length()!=se.length())
                   System.out.print("NO");
               else
               {
               for(int i=0;i<s.length();i++)
               {
                j=s.length()-1-i;   
                   if(s.charAt(i)==se.charAt(j))
                       c++;
               }
               if(c<s.length())
                    System.out.print("NO");
              else
                    System.out.print("YES");
               }
}
}
