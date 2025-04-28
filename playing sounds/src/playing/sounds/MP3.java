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
public class MP3 implements MediaPlayer{

    public MP3() {
    }

    @Override
    public void play(String fileName) {
     System.out.println("Playing MP3 File " + fileName); 
    }
    
}
