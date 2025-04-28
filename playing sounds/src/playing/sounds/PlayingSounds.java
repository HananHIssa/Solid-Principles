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
public class PlayingSounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 MediaPlayer player = new MP3();
 player.play("file.mp3");
 player = new FormatAdapter(new Mp4Player());
 player.play("file.mp4");
 player = new FormatAdapter(new VlcPlayer());
 player.play("file.avi");
 }
} // TODO code application logic here
  
    
}
