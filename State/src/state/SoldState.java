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
public class SoldState implements State{

    SoldState(GumballMachine aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertQuartor() {
        System.out.print("you can not inserted another quartor ");
    }

    @Override
    public void ejectQuarter() {
        System.out.print("Sorry,you already trunk the crank ");
    }

    @Override
    public void turnCrank() {
        System.out.print("Turning twice doesnt get you another gumball! ");
    }

    @Override
    public void dispense() {
        System.out.print("a gumball comes rolling out the slot ");
        count-=1;
        if(count==0)
        {
                    System.out.print("oopss,out of gumball!");
                    state=SoldOutState;
        }
        else
            state=NoQuarterState;
    }
    
}
