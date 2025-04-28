
package javaapplication46;

import java.util.Scanner;

public class JavaApplication46 {
public static int []sumofarray(int[]a,int target)
{
    int b[]=new int[2];
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {   if(a[j]==target-a[i])
                b[0]=i;b[1]=j;}          
    }
    return b;
}
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
        int n=in.nextInt();int target=in.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=in.nextInt(); 
    }
     sumofarray 
}
