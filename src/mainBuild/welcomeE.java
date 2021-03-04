package mainBuild;

import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class welcomeE extends JPanel{
	
	Image img;
	Boolean draw = true;
	public welcomeE() 
	{
		setLayout(null);
		
		img = Toolkit.getDefaultToolkit().createImage("welcomePage.png");
		
		JButton btnStart = new JButton();
		btnStart.setBounds(390, 330, 220, 100);
		btnStart.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		draw = false;
        		removeAll();
        		repaint();
        		revalidate();
        		CharacterStory cs = new CharacterStory();
        		cs.setBounds(0, 0, getWidth(),getHeight());
        		add(cs);
			}
		});
		btnStart.setOpaque(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);
		add(btnStart);
		
		JButton btnExit = new JButton("");
		btnExit.setBounds(390, 440, 220, 100);
		btnExit.setOpaque(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		System.exit(0);
			}
		});
		add(btnExit);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
	    if (draw) {
	        g2.drawImage(img, 0, 0, getWidth(), getHeight(), this); 
	    }
		
    }
}
