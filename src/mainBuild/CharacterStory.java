package mainBuild;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import GamePlayStages.GamePlay1;
import levelStagesGUI.Level1;

public class CharacterStory extends JPanel{
	
	Boolean draw = true;
	Timer MyTimer;
	int current = 1;
	Image img[] = new Image[7];
	
	public CharacterStory(){
		setLayout(null);
		for (int i=1; i<7; i++){
			img[i] = Toolkit.getDefaultToolkit().createImage("Story/storypart" + i + ".png");
		}
		JButton btnNext = new JButton();
		btnNext.setBounds(900, 330, 80, 75);
		btnNext.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		draw = false;
        		removeAll();
        		repaint();
        		revalidate();
        		MyTimer.stop();
				MyTimer.removeActionListener(this);
        		Level1 l1 = new Level1();
        		l1.setBounds(0, 0, getWidth(),getHeight());
				l1.setVisible(true);
				add(l1);
			}
		});
		btnNext.setOpaque(false);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		add(btnNext);
		
		MyTimer = new Timer(2500, new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				current++; 
			repaint();
			revalidate();
			if(current == 7){
				draw = false;
				repaint();
        		revalidate();
				MyTimer.stop();
				MyTimer.removeActionListener(this);
				removeAll();
				Level1 l1 = new Level1();
				l1.setBounds(0, 0, getWidth(),getHeight());
				l1.setVisible(true);
				add(l1);
				
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