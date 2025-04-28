
package student.pkg11;
public class Student11 {
    static int x;
    static {
        x=800;
    }
 static void main(String[] args) {
       Student11 a=new Student11();
       System.out.println(Student11.x);
       a=null;
        System.out.println(Student11.x);
       
    }
    
}
