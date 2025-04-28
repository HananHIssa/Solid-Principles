
package javaapplication11;

import java.util.Scanner;
public class JavaApplication11 {

    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
    String x=s.nextLine();
    String z="0000000";
    String o="1111111";
    int c=0;
    for(int i=0;i<x.length()-1;i++)
    { if(x.contains(z)||x.contains(o))
    {  c++;
    }
    }
    if(c!=0)
     System.out.print("YES");
    else
     System.out.print("NO");
    }
    
}