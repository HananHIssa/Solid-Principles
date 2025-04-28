/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persons;

/**
 *
 * @author hp
 */
public class engineer extends Persons implements Comparable<engineer>{
    public String name = "ahmad";public int age ;
    @Override
    public void print()
    {
        System.out.println("engineer");
    }

    @Override
    public int compareTo(engineer t) {
        if(this.name.compareTo(t.name)==0)
            return 1;
        else return 0;
    }
    @Override
    public boolean equals(Object o)
    {
         if(this==o) return true;
         if(o==null||this.getClass()!=o.getClass())
             return false;
         return this.name.equals(o.name);
    }   
}
