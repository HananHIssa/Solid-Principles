
package student1;
public class Student1 {

    private String name;
    private int age;
    public String getName()
    {
        return name;
    }
     public String getAge()
    {
        return name;
    }
      public void setName(String name)
    {
       this.name=name;
    }
        public void setAge(int age)
    {
       this.age=age;
    }
    
    public static void main(String[] args) {
       Student1 s=new Student1();
       s.name="mohamad";
       s.age=18;
       Student1 s1=new Student1();
        s1.name="bana";
       s1.age=19;
    }
    
}
