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
public class GamePlay8 extends JPanel{
	Image img;
	Boolean draw = true;
        
    Boolean kick = false;
	Boolean tree = false;
	Boolean trunk=false;
    Boolean trunkHO=false;
	Boolean treeH = false;
	Boolean treeHD = false;
	Boolean kickHO = false;
        
	Boolean kitr = false;
	Boolean kitru = false;
	Boolean trtr = false;
	int ca=0;
	int checkO=0,checkK=0,checkTRE=0,checkTRU=0;
	
	public GamePlay8() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8a.png");
		
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
        		Level8 l8= new Level8();
        		l8.setBounds(0, 0, getWidth(),getHeight());
        		add(l8);
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
    	if (ca == 0){
   			if (s.equals("kick")&&checkK==0){
				kick = true;
				checkO++;
				checkK=1;
				ca =1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8b.png");
				repaint();
	            revalidate();
			}
			
			if(s.equals("tree")&&checkTRE==0){
				tree= true;
				checkO++;
				checkTRE=1;
				ca =1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8c.png");
				repaint();
				revalidate();
			}
	        if(s.equals("trunk")&&checkTRU==0){
				trunk = true;
				checkO++;
				checkTRU=1;
				ca =1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8d.png");
				repaint();
	            revalidate();
			}
   		}
   		else if(ca ==1){
   			if(kick){
   				if(s.equals("tree")&&checkTRE==0){
    				kick = true;
    				checkO++;
    				checkTRE=1;
    				ca =2;
    				kitr = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8e.png");
    				repaint();
    				revalidate();
    			}
   				if(s.equals("trunk")&&checkTRU==0){
    				trunk = true;
    				checkO++;
    				checkTRU=2;
    				ca =1;
    				kitru = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8f.png");
    				repaint();
    	            revalidate();
    			}
   			}
   			else if(tree){
   				if (s.equals("kick")&&checkK==0){
    				kick = true;
    				checkO++;
    				checkK=1;
    				ca =2;
    				kitr = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8e.png");
    				repaint();
    	            revalidate();
    			}
    	        if(s.equals("trunk")&&checkTRU==0){
    				trunk = true;
    				checkO++;
    				checkTRU=1;
    				ca =2;
    				trtr = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8g.png");
    				repaint();
    	            revalidate();
    			}
   			}
   			else if(trunk){
   				if (s.equals("kick")&&checkK==0){
    				kick = true;
    				checkO++;
    				checkK=1;
    				ca =2;
    				kitru = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8f.png");
    				repaint();
    	            revalidate();
    			}
    			
    			if(s.equals("tree")&&checkTRE==0){
    				tree = true;
    				checkO++;
    				checkTRE=1;
    				ca =2;
    				trtr = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level8/8g.png");
    				repaint();
    				revalidate();
    			}
   			}
   		}
   		else if(ca ==2){
   			if (s.equals("kick")&&checkK==0){
				kick = true;
				checkO++;
				checkK=1;
				ca =3;
			}
			
			if(s.equals("tree")&&checkTRE==0){
				tree = true;
				checkO++;
				checkTRE=1;
				ca =3;
			}
			if(s.equals("trunk")&&checkTRU==0){
				trunk = true;
				checkO++;
				checkTRU=1;
				ca =3;
			}
   		}
		
                
		if(checkO == 3||ca ==3){
			draw = false;
			removeAll();
            repaint();
            revalidate();
            Level9 l9 = new Level9();
            l9.setBounds(0, 0, getWidth(),getHeight());
            add(l9);
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
