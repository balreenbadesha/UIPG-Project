package GamePlayStages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

import mainBuild.welcomeE;
import levelStagesGUI.*;
public class GamePlay3 extends JPanel{
	Image img;
	Boolean draw = true;
    Boolean move = false;
	Boolean cube = false;
    Boolean left = false;
    Boolean leftHM=false;
	Boolean cubeH = false;
	Boolean cubeHM = false;
	Boolean moveHC = false;
	
	// decision
	Boolean MoveH = false;
	Boolean mocu = false;
	Boolean mole = false;
	Boolean cule = false;
	int ca=0;
	int checkO=0,checkM=0,checkC=0,checkL=0;
        
	public GamePlay3() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3a.png");
		
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
        		Level3 l3 = new Level3();
        		l3.setBounds(0, 0, getWidth(),getHeight());
        		add(l3);
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
       			if (s.equals("move")&&checkM==0){
    				move = true;
    				checkO++;
    				checkM=1;
    				ca =1;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3b.png");
    				repaint();
    	            revalidate();
    			}
    			
    			if(s.equals("cube")&&checkC==0){
    				cube = true;
    				checkO++;
    				checkC=1;
    				ca =1;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3c.png");
    				repaint();
    				revalidate();
    			}
    	        if(s.equals("left")&&checkL==0){
    				left = true;
    				checkO++;
    				checkL=1;
    				ca =1;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3d.png");
    				repaint();
    	            revalidate();
    			}
       		}
       		else if(ca ==1){
       			if(move){
       				if(s.equals("cube")&&checkC==0){
        				cube = true;
        				checkO++;
        				checkC=1;
        				ca =2;
        				mocu = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3e.png");
        				repaint();
        				revalidate();
        			}
       				if(s.equals("left")&&checkL==0){
        				left = true;
        				checkO++;
        				checkL=2;
        				ca =1;
        				mole = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3f.png");
        				repaint();
        	            revalidate();
        			}
       			}
       			else if(cube){
       				if (s.equals("move")&&checkM==0){
        				move = true;
        				checkO++;
        				checkM=1;
        				ca =2;
        				mole = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3e.png");
        				repaint();
        	            revalidate();
        			}
        	        if(s.equals("left")&&checkL==0){
        				left = true;
        				checkO++;
        				checkL=1;
        				ca =2;
        				cule = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3g.png");
        				repaint();
        	            revalidate();
        			}
       			}
       			else if(left){
       				if (s.equals("move")&&checkM==0){
        				move = true;
        				checkO++;
        				checkM=1;
        				ca =2;
        				mole = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3f.png");
        				repaint();
        	            revalidate();
        			}
        			
        			if(s.equals("cube")&&checkC==0){
        				cube = true;
        				checkO++;
        				checkC=1;
        				ca =2;
        				cule = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level3/3g.png");
        				repaint();
        				revalidate();
        			}
       			}
       		}
       		else if(ca ==2){
       			if (s.equals("move")&&checkM==0){
    				move = true;
    				checkO++;
    				checkM=1;
    				ca =3;
    			}
    			
    			if(s.equals("cube")&&checkC==0){
    				cube = true;
    				checkO++;
    				checkC=1;
    				ca =3;
    			}
    			if(s.equals("left")&&checkL==0){
    				left = true;
    				checkO++;
    				checkL=1;
    				ca =3;
    			}
       		}
			
	                
			if(checkO == 3||ca ==3){
				draw = false;
				removeAll();
				repaint();
				revalidate();
				Level4 l4 = new Level4();
				l4.setBounds(0, 0, getWidth(),getHeight());
	            add(l4);
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
