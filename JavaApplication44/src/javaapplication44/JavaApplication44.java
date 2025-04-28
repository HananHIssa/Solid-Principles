
package javaapplication44;
import java.util.*;
public class JavaApplication44 {
   public static boolean isprime(int x)
   {int c=0;
        for(int i=2;i<=x/2;i++)
   {   if(x%i==0)
           c++;}
   if(c==0)
       return true;
   else
      return false;

   }
   public static boolean isperfect(int x)
   {
       int sum=0;
       for(int i=1;i<x;i++)
       { if(x%i==0)
               sum+=i;}
     if(x==sum)return true;
     return false;
   }        
   public static boolean isArmstrong(int x)
   {int c=0;
       int y=x;
       while(y!=0)
       {
           y/=10;c++;
       }
       int z=x;double sum=0;
       while(z!=0)
       {
           int r=x%10;
           sum=+Math.pow(r, c);
           x/=10;
       }
       if(sum==x)return true;
       else return false;
   }
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int x=in.nextInt();int c=0;
  if(isprime(x))
      System.out.println("prime");
  else System.out.println("Not prime");
  if(isperfect(x))
      System.out.println("perfect");
  else System.out.println("Not perfect");
  if(  !isArmstrong(x))
      System.out.println("Not Armstrong ");
  else System.out.println("Armstrong");
}
}