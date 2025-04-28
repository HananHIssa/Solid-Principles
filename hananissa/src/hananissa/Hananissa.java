
package hananissa;
import java.util.*;
public class Hananissa {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
          s=s.toLowerCase();
          String str=" ";
        for(int i=0;i<s.length();i++)
        { if(!(str.charAt(i)=='a'||str.charAt(i)=='o'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='i'))
            str+='.';
            str+=s.charAt(i);
                }
        System.out.print(str);
    }
    
}
