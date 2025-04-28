/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playing.sounds;

/**
 *
 * @author hp
 */
public class FormatAdapter implements MediaPackage{
   MediaPackage m;
    public FormatAdapter(MediaPackage m) {
        this.m=m;
    }
   
    @Override
    public void playfile(String fileName) {
        m.playfile(fileName);
    }
    
}
