
package javaapplication55;import java.util.*;
public class JavaApplication55 {
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt() ;int a[]=new int[n];int[]b=new int[n];int x=n+n;int c[]=new int[x];int u=0;
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n;i++)
            b[i]=in.nextInt();
        for(int i=0;i<a.length;i++)
        { c[i]=a[i];u++;}
        for(int i=0;i<b.length;i++)
            c[u++]=b[i];
        for(int i=0;i<x;i++)
            System.out.print(a[i]+" ");
    }      
    
}
