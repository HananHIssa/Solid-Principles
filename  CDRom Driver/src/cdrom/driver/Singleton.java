/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdrom.driver;

/**
 *
 * @author hp
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // Synchronized method to control access to the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
