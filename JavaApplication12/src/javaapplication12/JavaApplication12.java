
package javaapplication12;
import java.util.Scanner;
public class JavaApplication12 {
    
    public static void main(String[] args) {
      /* Scanner st=new Scanner(System.in);
               String s=st.nextLine();int c=0,p=1;
               String se=st.nextLine();int j;
    
               for(int i=0;i<s.length();i++)
               {
                j=s.length()-1-i;   
                   if(s.charAt(i)==se.charAt(j))
                       c++;
               }
               if(c<s.length())
                    System.out.print("NO");
              else
                    System.out.print("YES");*/
         Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
 
        boolean c = true;
        for(int i=0 ; i<s1.length() ; i++)
            if(s1.charAt(i) == s2.charAt(s2.length()-1-i)){
                c = true;
                break;
            }
      if(c)
      System.out.print("YES");
      else
      System.out.print("NO");
}
}