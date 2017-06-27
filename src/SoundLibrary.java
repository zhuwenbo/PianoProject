
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public abstract class SoundLibrary {
    protected int iChannel;
    protected int iVolume = 100;
    protected final static int susDuration = 300;
   
    
    public SoundLibrary()
    {        
    };
    
    
    public void setChannel(int chan)
    {iChannel = chan;}
    public int getChannel()
    {return iChannel;}
    
    public void setVolume(int vol)
    {iVolume = vol;}
    public int getVolume()
    {return iVolume;}
    
    
     public synchronized void play(final String name,final boolean sus) 
    {

        // Note: use .wav files             

        new Thread(new Runnable() { 
            @Override
            public void run() {
                    switch(name)
                    {
                        case "C": playC(sus);
                                  break;
                        case "D": playD(sus);
                                  break;
                        case "E": playE(sus);
                                  break;
                        case "F": playF(sus);
                                  break;
                        case "G": playG(sus);
                                  break;
                        case "A": playA(sus);
                                  break;
                        case "B": playB(sus);
                                  break;
                        case "Cs": playCs(sus);
                                  break;
                        case "Ds": playDs(sus);
                                  break;
                        case "Fs": playFs(sus);
                                  break;
                        case "Gs": playGs(sus);
                                  break;
                        case "As": playAs(sus);
                                  break;
                    }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                }
                }
        }).start();
        
    }
    
     
    
    public abstract void playC(boolean sus);
    public abstract void playD(boolean sus);
    public abstract void playE(boolean sus);
    public abstract void playF(boolean sus);
    public abstract void playG(boolean sus);
    public abstract void playA(boolean sus);
    public abstract void playB(boolean sus);
    public abstract void playCs(boolean sus);
    public abstract void playDs(boolean sus);
    public abstract void playFs(boolean sus);
    public abstract void playGs(boolean sus);
    public abstract void playAs(boolean sus);
 
}
