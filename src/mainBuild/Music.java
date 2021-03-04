package mainBuild;
import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class Music extends JFrame implements Runnable{
	
	public Music(){
		run();
	}

    public void run(){
        
        try {
            File soundFile = new File("Game.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl gainControl = (FloatControl)
            clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(5.0f);
            clip.start();
        }
        
        catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
        catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}