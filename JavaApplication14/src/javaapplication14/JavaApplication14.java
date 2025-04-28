
package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        String s=st.nextLine();int j=0;int c=0;
       for(int i=1;i<s.length();i++)
       { if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
       {  j++;
       
       }
     if(s.charAt(0)>='a'&&s.charAt(0)<='z')
     {c++;
     }
     }
       
    if(j==s.length()-1&&c==1)
    {System.out.println(s.toUpperCase().charAt(0)+s.toLowerCase().substring(1, s.length()));
    
    }
    else
      System.out.println(s);
    }
}
