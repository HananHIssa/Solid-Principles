
package javaapplication10;
public class JavaApplication10 {
    static int revers(int x)
    {int sum=0;
        if(x==0)
            return 0;
        else
             return x%10+ revers(x/10);

    }
    public static void main(String[] args) {
  System.out.println(revers( 1234)); 
    }
    
}
