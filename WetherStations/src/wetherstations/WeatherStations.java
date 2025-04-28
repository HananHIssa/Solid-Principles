
package wetherstations;

import java.util.ArrayList;
public class WeatherStations implements Subject{
    ArrayList<Observer> Observers;
    String Weather;

    public WeatherStations(ArrayList Observers) {
       this. Observers=new ArrayList();
    }
    
 public void addObservers(Observer o)
 {
  Observers.add(o);
 }
 public void removeObservers(Observer o)
 {
     Observers.remove(o);
 }
 public void notrifyObservers()
 {
        for (Observer observer : Observers) 
     {
         observer.update(Weather);
     }
 }
  public void setWeather(String Weather)
  {
      this.Weather=Weather;
      notrifyObservers();
  }
    
}
