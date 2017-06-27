import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;


public class RegularSound extends SoundLibrary {
        Synthesizer synth = MidiSystem.getSynthesizer();
	MidiChannel[] channels = synth.getChannels();
    
    
    public RegularSound() throws MidiUnavailableException
    {
        super();
        iChannel = 0;
        synth.open();
        
        
    }
  
    @Override
    public void playC(boolean sus)
    {   
        channels[0].noteOn( 60, iVolume); // C note   
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(60, iVolume);
    }
    
        @Override
    public void playD(boolean sus)
    {   
        channels[0].noteOn( 62, iVolume); 
         if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(62, iVolume);
    }

    
    @Override
    public void playE(boolean sus)
    {   
        channels[0].noteOn( 64, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(64, iVolume);
    }

    
    @Override
    public void playF(boolean sus)
    {   
        channels[0].noteOn( 65, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(65, iVolume);
    }
    
    @Override
    public void playG(boolean sus)
    {   
        channels[0].noteOn( 67, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(67, iVolume);
    }
    
    @Override
    public void playA(boolean sus)
    {   
        channels[0].noteOn( 69, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(69, iVolume);
    }
    
    @Override
    public void playB(boolean sus)
    {   
        channels[0].noteOn( 71, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(71, iVolume);
    }
    
    //SHARP NOTES
    @Override
    public void playCs(boolean sus)
    {   
        channels[0].noteOn( 61, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(61, iVolume);
    }
    
    @Override
    public void playDs(boolean sus)
    {   
        channels[0].noteOn( 63, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(63, iVolume);
    }

    
    @Override
    public void playFs(boolean sus)
    {   
        channels[0].noteOn( 66, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(66, iVolume);
    }
    
    @Override
    public void playGs(boolean sus)
    {   
        channels[0].noteOn( 68, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(68, iVolume);
    }
    
    @Override
    public void playAs(boolean sus)
    {   
        channels[0].noteOn( 70, iVolume); 
        if (sus == true)
        {
            try {
                Thread.sleep(susDuration);
            } catch (InterruptedException ex) {
            } 
        }
        channels[0].noteOff(70, iVolume);
    }
    
}
