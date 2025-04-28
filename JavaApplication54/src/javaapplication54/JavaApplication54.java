
package javaapplication54;
import java .util.*;
public class JavaApplication54 {
    public static int dublicateArray(int[]a)
    {
        int j=0;int[]temp=new int[a.length];
       for(int i=0;i<a.length-1;i++)
       {   if(a[i]!=a[i+1])
       { temp[j++]=a[i];
       }
       }
       temp[j++]=a[a.length-1];
       for(int i=0;i<a.length;i++)
           a[i]=temp[i];
      
        return j;
    }
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();int c=0; int x;
        int a[]=new int[n];
       for(int i=0;i<n;i++)
       {  a[i]= in.nextInt();}
       x=dublicateArray(a);
     for(int i=0;i<x;i++)
         System.out.println(a[i]);
    }
    }
    

