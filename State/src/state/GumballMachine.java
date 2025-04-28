/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author hp
 */
public class GumballMachine {
    State soldOutState;
    State noQuartorState;
    State hasQuartorState;
    State soldState;
    int count =0;

    public GumballMachine(int number) {
        soldOutState = new SoldOutState(this);
        noQuartorState = new NoQuartorState(this);
        hasQuartorState = new hasQuartorState(this);
        soldState = new SoldState(this);
    }
    
}
