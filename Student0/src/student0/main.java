
package student0;
public class main {
 public static void main(String[]args)
 {
      Student0 s=new Student0();
      s.setName("ali");
      s.setAvg(98.6);
      Student0 s1=new Student0();
      s1.setName("hanan");
      s1.setAvg(97);
      if(s.getAvg()>s1.getAvg())
          System.out.println(s.getName());
      else
          System.out.println(s1.getName());
     /* System.out.println(s.getContofstud());*/
 }
}
