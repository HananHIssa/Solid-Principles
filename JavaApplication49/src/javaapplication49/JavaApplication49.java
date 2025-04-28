
package javaapplication49;import java.util.*;
public class JavaApplication49 {
    static int lcm=0;
    public static int lcm(int x,int y)
    { 
       lcm+=y;
       if(lcm%x==0&&lcm%y==0)
           return lcm;
       else
           return lcm(x,y);
    }        
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       int m=in.nextInt();
       int max=n>m?n:m;
         System.out.println(lcm(n,max));
    }
    
}
