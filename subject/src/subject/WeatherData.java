
package subject;

import java.util.ArrayList;

public class WeatherData implements Subjects{
 private ArrayList Observer;
 private float temperature;
 private float humidilty;
 private float pressure;
 public WeatherData()
 {
     Observer=new ArrayList();
 }
    @Override
    public void registerObserver(Observer o) {
        Observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i=Observer.indexOf(o);
        if(i>=0)
        Observer.remove(i);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidilty() {
        return humidilty;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void notifyObserver() {
       for(int i=0;i<Observer.size();i++)
       {
           Observer observer=(Observer)Observer.get(i);
           observer.update(temperature, humidilty, pressure);
       }
    }
    public void measurmentschanged()
    {
        notifyObserver();
        
    }
}
