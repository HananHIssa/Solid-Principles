
package person;
public abstract class Person {
String name;
boolean isMarrid;
char gender;
    public Person() {
    }
    public Person(String name, boolean isMarrid, char gender) {
        this.name = name;
        this.isMarrid = isMarrid;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isIsMarrid() {
        return isMarrid;
    }
    public void setIsMarrid(boolean isMarrid) {
        this.isMarrid = isMarrid;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public abstract void printInfo();
}
