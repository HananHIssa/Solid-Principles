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
public class VlcPlayer implements MediaPackage{

    @Override
    public void playfile(String fileName) {
 System.out.println("Playing vlc file. Name: "+ fileName); 
    }
    
}
