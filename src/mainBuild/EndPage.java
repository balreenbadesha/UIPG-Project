package mainBuild;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EndPage extends JPanel{
	Image img;
	Boolean draw = true;
	public EndPage(){
		setLayout(null);
		
		img = Toolkit.getDefaultToolkit().createImage("end.png");
		
		JButton btnExit = new JButton("");
		btnExit.setBounds(390, 200, 230, 130);
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
