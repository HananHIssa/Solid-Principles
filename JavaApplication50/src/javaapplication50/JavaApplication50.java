
package javaapplication50;
import java.util.*;
class JavaApplication50 {
    public static int fun(String s,int x,int y)
    {
        if(x==y) return 0;
        else{ 
            int c=0;
          if(s.charAt(x)==s.charAt(y))  c=1;
          else c=0;
          return c+fun(s,x+1,y-1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();int a=0;int d=0;
        String s=in.next();
        if(fun(s,0,s.length()-1)==s.length()/2);
        System.out.println("paln");
        else
         System.out.println("Not paln");
}
}
