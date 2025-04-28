
package student.pkg3;
public class Student3 {
    String name="Ali";
    double egs=90.5;
    static int contofstudents=100;
    public Student3()
    {
        System.out.println("constrocter"+contofstudents);
        
    }
    {
        this.contofstudents=9000;
         System.out.println("instance"+contofstudents);
    }
    static
    {
         System.out.println("static"+contofstudents);
    }
    public static void main(String[] args) {
      /* Student3 s=new Student3();*/
       
    }
    
}
