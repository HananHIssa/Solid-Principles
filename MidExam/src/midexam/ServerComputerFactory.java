/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author hp
 */
class ServerComputerFactory implements AbstractFactory {
    @Override
    public Case createCase() {
        return new ServerCaseType2();
    }

    @Override
    public Monitor createMonitor() {
        return new ServerMonitorType2();
    }

    @Override
    public Keyboard createKeyboard() {
        return new ServerKeyboardType2();
    }
}