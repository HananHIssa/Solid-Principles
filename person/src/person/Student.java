
package person;
public class Student extends Person implements Academic{
 double gpa;
 String University;
 int id;
    public Student(double gpa, String University, int id) {
        this.gpa = gpa;
        this.University = University;
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void printInfo() {
    }

    @Override
    public String Qualifications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String certificates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Student{" + "gpa=" + gpa + ", University=" + University + ", id=" + id + '}';
    }
    
}
