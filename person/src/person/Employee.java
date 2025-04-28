
package person;
public abstract class Employee extends Person implements Paid{
 int experience;
 boolean classification;//هل مثبت ومصنف؟؟
 int yearsofstart;
 int yersofend;
 abstract void accidentrecord();//سجل الحوادث
 abstract void disciplinaryAction();//اجراءات تأديبية
    public int getYearsofstart() {
        return yearsofstart;
    }

    public void setYearsofstart(int yearsofstart) {
        this.yearsofstart = yearsofstart;
    }

    public int getYersofend() {
        return yersofend;
    }

    public void setYersofend(int yersofend) {
        this.yersofend = yersofend;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isIsCategory() {
        return isCategory;
    }

    public void setIsCategory(boolean isCategory) {
        this.isCategory = isCategory;
    }
    
}
