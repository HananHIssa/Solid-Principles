/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author hp Hanan issa
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = (AbstractFactory) new ServerComputerFactory();
        Case serverCase = factory.createCase();
        Monitor monitor = factory.createMonitor();
        Keyboard keyboard = factory.createKeyboard();
        Case greyCase = new ColorDecorator(serverCase, "grey");
        System.out.println(greyCase.description());  
        System.out.println(monitor.description());   
        System.out.println(keyboard.description());  
    }
}
