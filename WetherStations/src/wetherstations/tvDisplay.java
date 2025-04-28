/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wetherstations;

/**
 *
 * @author hp
 */
public class tvDisplay implements Observer,display{
    String Weather;
    WeatherStations weather;

    public tvDisplay(WeatherStations weather) {
        this.weather = weather;
        weather.addObservers(this);
    }
    
    @Override
    public void display() {
    }

    @Override
    public void update(String Weather) {
        
    }
    
}
