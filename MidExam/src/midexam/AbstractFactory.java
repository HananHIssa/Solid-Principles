/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author hp Hanan issa 202110057
 */
public interface AbstractFactory {
    Case createCase();
    Monitor createMonitor();
    Keyboard createKeyboard();
}
