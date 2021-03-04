package levelStagesGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import GamePlayStages.*;
import mainBuild.welcomeE;

public class Level2 extends JPanel{
	Image img;
	Boolean draw = true;
	public Level2() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("2.png");
		
		JButton btnBack = new JButton();
		btnBack.setBounds(10, 5, 60, 65);
		btnBack.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		draw = false;
        		removeAll();
        		repaint();
        		revalidate();
        		welcomeE homeB= new welcomeE();
        		homeB.setBounds(0, 0, getWidth(),getHeight());
        		add(homeB);
			}
		});
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
		
		JButton btnNext = new JButton();
		btnNext.setBounds(900, 330, 80, 75);
		btnNext.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		draw = false;
        		removeAll();
        		repaint();
        		revalidate();
        		GamePlay2 gp2 = new GamePlay2();
        		gp2.setBounds(0, 0, getWidth(),getHeight());
        		add(gp2);
        		
			}
		});
		btnNext.setOpaque(false);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		//btnNext.setVisible(true);
		add(btnNext);
	}
	
	public void paintComponent(Graphics g)
    {
		super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D) g;
	    if (draw) {
	        g2.drawImage(img, 0, 0, getWidth(), getHeight(), this); 
	    }
    }
}
