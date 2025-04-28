
package javaapplication195;

import java.util.Arrays;

public class JavaApplication195 {
    public static void main(String[] args) {
      /* System.out.println (power(2,3));
       for(int i=1;i<10;i++){
           if(isFibonacci(i))
       System.out.println (i+"isFibonacci");
           else 
       System.out.println (i+"isNotFibonacci");       
       }*/
      /*isPowerOf2(8);
      if(isPrime(4))
       System.out.println ("prime");
           else 
       System.out.println ("Not prime");*/
      System.out.print(isRotated("sumitjain","tjainsumi"));
    }

    private static int power(int a, int base) {
       if(a==0)
           return 1;
       return base * power(a-1,base);
    }
    public static boolean isFibonacci(int i)
    {
        return PerfectSqure((5*i*i)+4)||PerfectSqure((5*i*i)-4);
    }
    private static boolean PerfectSqure(int i) {
       int squre=(int) Math.sqrt(i);
       return squre*squre==i;
    }
    public static void isPowerOf2(int x)
    {
        double pow2=Math.ceil(Math.log(x)/Math.log(2));
        double pow22=Math.floor(Math.log(x)/Math.log(2));
        if(pow2==pow22) System.out.println("is power of 2");
        else System.out.println("is not power of 2");
    }
    public static boolean isPrime(int n)
    {   int sqrt=(int) Math.sqrt(n);
        if(n<2) return false;
        for(int i=2;i<=sqrt;i++)
        {
            if(n%i==0)
            return false;
            break;
        }
        return true;
    }
    public static boolean isRotated(String s,String str)
    {
        String adds=s+s;
        if(adds.contains(str))
            return true;
        else 
            return false;
    }
    public static boolean isPermetotion(String s,String str)
    {  
        if(s.length()!=str.length())
            return false;
        char []c=s.toCharArray();
        char []ch=str.toCharArray();
        Arrays.sort(c);Arrays.sort(ch);
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=ch[i])
                return false;
        } return true;
    }
    public static boolean isArmistrong(int x)
    {
        int c=0;
        int copy=x;int sum=0;
        while(copy!=0)
        {
            copy/=10;
            c++;
        }
        copy=x;
        while(copy!=0)
        {
            int dig=copy%10;
             sum += Math.pow(dig, c);
             copy/=10;
        }
        if(sum==x) return true;
        return false;
    }
    public static void TwoLargest(int arr [])
    {
        int first = Integer.MIN_VALUE;
        int secend = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            { secend=first;
                first =arr[i];
            }
            else if (secend <arr[i]) secend=arr[i];
        }
    }
    public static void primeFactor(int x)
    {
        if(x==2) System.out.print(x);
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
          System.out.print(i);
            x/=i;
        }
    }
    public static int MissingNum(int x[])
    {
        for(int i=0;i<x.length;i++)
        {
            if (x[i]!= i+1)
                return i+1;
            return n+1;
        }
    }
    public int ReverseNum(int x)
    {
        int rem=1;int reversalnum=0;
        while(x>0)
        {
             rem=x%10;
            reversalnum*=10;
            reversalnum+=rem;
            x/=10;
        }
    }
    public int[] reverseArray(int arr[])
    {
        int i=0;int j=arr.length-1;
        for( i=0;i<arr.length/2;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        } return arr;
    }
}
