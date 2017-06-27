
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;




public class GenerateSound {
    protected String fileName;
    
    public static synchronized void play(final String fileName) 

    {

        // Note: use .wav files             

        new Thread(new Runnable() { 
            public void run() {

                try {

                    Clip clip = AudioSystem.getClip();

                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));

                    clip.open(inputStream);

                    clip.start(); 

                } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {

                    System.out.println("play sound error: " + e.getMessage() + " for " + fileName);

                }

            }

        }).start();

    }
    

}
