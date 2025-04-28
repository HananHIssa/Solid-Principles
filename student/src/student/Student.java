
package student;
public class Student {

    private static void printInfo(String name, int age) {
        System.out.println(name+" "+" "+age);
    }

    public Student()
    {
        this("ali"); System.out.println(1);
    }
    public Student(String name)
    {
        this(name,18); System.out.println(2);
    }
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println(3);
    }
    int age;String name;
    public static void main(String[] args) {
       Student s=new Student();
        Student s1=new Student();
        /* Student s2=new Student("ali",19);*/
      if(s.age>s1.age)
          System.out.println(s.name);
      else
           System.out.println(s1.name);
    }
    /*System.out.println(age)*/
}
