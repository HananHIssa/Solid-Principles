/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorex;

/**
 *
 * @author hp
 */
public abstract class Beverge {
    public String Description="unknown Beverge";

    public String getDescription() {
        return Description;
    }
    public abstract double cost();
}
