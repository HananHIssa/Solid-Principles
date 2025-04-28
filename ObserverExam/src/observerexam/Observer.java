/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexam;

/**
 *
 * @author hp
 */
public  interface Observer {


    public void update(float temp, float hum, float pressure);
}
