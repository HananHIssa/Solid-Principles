
package javaapplication53;
import java .util.*;
public class JavaApplication53 {
static int[]revers(int[]a)
{
    for(int i=0;i<a.length/2;i++)
    {
        int temp=a[i];
        a[i]=a[a.length-1-i];
        a[a.length-1-i]=temp;
    }
  //  for(int i=0;i<a.length;i++)
      
    return a;
}
static int c;
static int[] Bublesort(int[]a)
{ c=0;
    for(int i=0;i<a.length-1;i++)
    {
        for(int j=0;j<a.length-1-i;i++)
        { if(a[j]>a[j+1])
            {
                int temp=a[j];a[j]=a[j+1];a[j+1]=temp;c++;
            }
        }
    }
    return a;
}
static int v;
static int[]selectionSort(int []a)
{v=0;
    for(int i=0;i<a.length;i++)
    {
        int temp=a[i];
        int j=i;
        while(j>0&&a[j-1]>temp)
        {   a[j]=a[j-1];
            j--;v++;
        }
        a[j]=temp;
    }return a;
}
    public static void main(String[] args) {
       Scanner in=new Scanner (System.in);
       int n=in.nextInt();
       int []a=new int[n];
       for(int i=0;i<a.length;i++)
           a[i]=in.nextInt();Bublesort(a);
       for(int i=0;i<a.length;i++)
       {revers(a);
       Bublesort(a);
       selectionSort(a);
       }
        if(c>v)
            System.out.println("Buble sort is better than insretion sort"+" "+c);
        else if(c<v)
            System.out.println(" insretion sort is better than  Buble sort"+" "+v);
        else
            System.out.println("equal"+c);
    }
    
}
