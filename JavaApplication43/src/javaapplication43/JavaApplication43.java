
package javaapplication43;
import java.util.*;
import java.util.Arrays;
public class JavaApplication43 {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int x=in.nextInt();   int c=0;
       while(x>0)
       {
           int n=in.nextInt();
         int []a=new int[n];  
         for(int i=0;i<a.length;i++)
             a[i]=in.nextInt();
         for(int i=0;i<a.length;i++)
             Arrays.sort(a);
         
        for(int i=0;i<a.length;i++)
        {if(a[i]==a[i+1])
             c++;}
       
       for(int i=0;i<a.length;i++)
       { if(c==3)System.out.println(a[i]);
           else System.out.println(-1);
       }
    }
    }
}
   
