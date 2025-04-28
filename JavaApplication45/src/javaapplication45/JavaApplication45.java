
package javaapplication45;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication45 {
static int[]sumOfArray(int[]a,int target)
{
    int b[]=new int[2];
    for(int i=0;i<a.length;i++)
    { if(a[i]+a[i+1]==target)
          b[0]=i;  
          b[1]=i+1;
       }
    return b;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();int target=in.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=in.nextInt        Scanner in=new Scanner(System.in);
();
        for(int i=0;i<a.length;i++)
        System.out.println(Arrays.toString(sumOfArray(a,target)));
    }
    
}
