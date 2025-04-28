
package person;
public class Administrative extends Employee{
int retirementyear;
String Section;
String address;

    public Administrative(int retirementyear, String Section, String address) {
        this.retirementyear = retirementyear;
        this.Section = Section;
        this.address = address;
    }

    public int getRetirementyear() {
        return retirementyear;
    }

    public void setRetirementyear(int retirementyear) {
        this.retirementyear = retirementyear;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
