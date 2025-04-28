
package observerexam;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ConcreteSubject implements Subjects{
  public float temp,hum,pressure;
  public ArrayList<Observer>observers;

    public ConcreteSubject() {
        observers=new ArrayList();
    }
  
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
       int i=observers.indexOf(o);
       if(i>=0)
           observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        
    }
    public void setMegerment(float temp,float hum,float pressure)
    {
        this.hum=hum;
        this.temp=temp;
        this.pressure=pressure;
        megetmentchanged();
    }
    {
        
    }

    public void megetmentchanged() {
        for(int i=0;i<observers.size();i++)
        {
            Observer observer=observers.get(i);
            observer.update(temp,hum,pressure);
        }
    }
}
