
package javaapplication52;

import java.util.Scanner;

public class JavaApplication52 {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String s=in.next();
       char[]ch=new char[s.length()];
       for(int i=0;i<s.length();i++)
           ch[i]=s.charAt(i);
       for(int i=0;i<s.length();i++)
       { for(int j=i+1;j<s.length();j++)
          {
              if(ch[i]==ch[j])
                  ch[j]='~';
          }
       
    }
       for(int i=0;i<s.length();i++)
       { if(ch[i]=='~')
               continue;
       else
               System.out.print(ch[i]);}
    
}
