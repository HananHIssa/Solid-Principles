
package student9;
public class Student9 {
private String name;
private String specialisation;
static int contofStudent;

    public Student9()
    {
        contofStudent++;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
     public void set(String specialisation)
    {
        
        this.specialisation=specialisation;
    }
    public String getspecialisation()
    {
        return specialisation;
    }
}
