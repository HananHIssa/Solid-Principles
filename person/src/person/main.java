
package person;
public class main {
    public static void main(String[]args)
    {
       // double gpa, String University, int id
    
       Academic a[]={new Student(99,"Ptuk",408620755),new Student(100,"Ptuk",408620755),new Teacher(1432,"khhajasl")};
    }             
    public static void displays (Person[]p)
    {
        for(int i=0;i<p.length;i++)
            System.out.println(p[i].getClass());
    }
    public static void displays(Paid[]p)
    { Employee e[]=(Employee[])p;
        for(int i=0;i<p.length;i++)
            if(e[i] instanceof Teacher)
            {   
         System.out.println(e[i].name+" "+"Teacher"+e[i].salary());
            }
            else if(e[i] instanceof Administrative)
                System.out.println(e[i].getName()+" "+"Administrative"+e[i].salary());
    }
    //c.A method that receives an Array of Acadimic and sort it based on rank such that all techers must appear before any student
    public static void sort(Academic[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j] instanceof Student &&a[j+1] instanceof Teacher)
                {
                    Academic temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                } 
        }
    }
        for (Academic a1 : a) {
            System.out.println(a1);
        }
}
}

