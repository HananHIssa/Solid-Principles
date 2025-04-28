
package hosbitasl;

import java.util.Scanner;

public class NewClass {
    public static void main(String args[])
            {
                String patname ;
int docnume;
                Scanner in=new Scanner(System.in);
                 Hosbitasl s[]=new Hosbitasl[5];
                 for(int i=0;i<s.length;i++)
                 {
                     s[i]=new Hosbitasl();
                     patname=in.next();s[i].setName(patname);
                 }
                 for(int i=0;i<s.length;i++)
                 {
                  docnume=in.nextInt();
                  s[i].setdocNume(docnume);
                 }
                 for(int i=0;i<s.length;i++)
                     if(s[i].getdocNume()>44)
                         System.out.println(s[i].getName());
            }
}
