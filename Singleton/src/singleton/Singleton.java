
package singleton;
public class Singleton {
 private static Singleton Instanse =null;
 private Singleton()
 {
  System.out.println("Singleton is Instantiated.");

 }
 public static Singleton getInstance()
 {
     if(Instanse==null)
       Instanse=new Singleton();
     return Instanse;
 }
 public static void main(String [] args)
 {
     Singleton.getInstance();
 }
    
}
