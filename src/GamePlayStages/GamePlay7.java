package GamePlayStages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import mainBuild.welcomeE;
import levelStagesGUI.*;
import mainBuild.welcomeE;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class GamePlay7 extends JPanel{
	Image img;
	Boolean draw = true;
        
    Boolean drop = false;
	Boolean purple = false;
    Boolean soap=false;
    Boolean little=false;
    Boolean well=false;
    Boolean soapHO=false;
    Boolean littleHO=false;
    Boolean wellHO=false;
	Boolean purpleH = false;
	Boolean purpleHD = false;
	Boolean dropHO = false;
        
    int checkO=0,checkD,checkP,checkS,checkL,checkW;
        
	public GamePlay7() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level7/7a.png");
		
        JTextField answer = new JTextField();
		answer.setBounds(400,580,150,30);
		answer.setForeground(Color.WHITE);
		answer.setVisible(true);
		add(answer);
		
		answer.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(Color.gray);
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(UIManager.getColor("TextField.background"));
			}

        });
            
                
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
                
                JButton btnGo = new JButton();
		btnGo.setBounds(725, 555, 80, 75);
		btnGo.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		gameplay(answer.getText());
        		answer.setText("");
			}
		});
		btnGo.setOpaque(false);
		btnGo.setContentAreaFilled(false);
		btnGo.setBorderPainted(false);
		add(btnGo);
		
	}
        
        public void gameplay(String s){
        	if (s.equals("drop")&&checkD==0){
   				drop = true;
   				checkO++;
   				checkD=1;
   				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level7/7b.png");
   				repaint();
   	            revalidate();
  			}
			
			if(drop){
				if(s.equals("purple")&&checkP==0){
					purple = true;
					checkO++;
					checkP=1;
					img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level7/7c.png");
					repaint();
		            revalidate();
				}
			}
			if(purple){
				if(s.equals("soap")&&checkS==0){
					soap = true;
					checkO++;
					checkS=1;
					img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level7/7d.png");
					repaint();
		            revalidate();
				}
			}
			if(soap){
				if(s.equals("little")&&checkL==0){
					little = true;
					checkO++;
					checkL=1;
					img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level7/7e.png");
					repaint();
		            revalidate();
				}
			}
			
			if(little){
				if(s.equals("well")&&checkW==0){
					well = true;
					checkO++;
					checkW=1;
					img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level7/7f.png");
					repaint();
		            revalidate();
				}
			}
	                
			if(checkO == 5){
				draw = false;
	            removeAll();
	            repaint();
	            revalidate();
	            Level8 l8 = new Level8();
	            l8.setBounds(0, 0, getWidth(),getHeight());
	            add(l8);
			}
		
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
