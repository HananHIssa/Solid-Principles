
package javaapplication232;

import java.util.ArrayList;

public class JavaApplication232 {

    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        /*a.add(4);
        a.add("s");
        a.add('s');*/
        addLast(a,0,5);
        System.out.print(a);
    }
    public static ArrayList addLast(ArrayList a,int size,int num)
    {
        a.set(size, a);
        size++;
        return a;
    }
    
}
