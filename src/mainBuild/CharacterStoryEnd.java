package mainBuild;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import GamePlayStages.GamePlay1;
import levelStagesGUI.Level1;

public class CharacterStoryEnd extends JPanel{
	
	Boolean draw = true;
	Timer MyTimer;
	int current = 1;
	Image img[] = new Image[210];
	
	public CharacterStoryEnd(){
		setLayout(null);
		for (int i=1; i<210; i++){
			img[i] = Toolkit.getDefaultToolkit().createImage("StoryEnd/storypart" + i + ".png");
		}
		
		MyTimer = new Timer(250, new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				current++; 
			repaint();
			revalidate();
			if(current == 209){
				draw = false;
				repaint();
        		revalidate();
				MyTimer.stop();
				MyTimer.removeActionListener(this);
				removeAll();
				EndPage end = new EndPage();
        		end.setBounds(0, 0, getWidth(),getHeight());
				end.setVisible(true);
				add(end);
				
			}
			} });
		MyTimer.start();
	}
	
	
	public void paintComponent(Graphics g)
    {
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
	    if(draw){
	    	g2.drawImage(img[current], 0, 0, getWidth(), getHeight(), this);
	    }
    }
	

}