package GamePlayStages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

import mainBuild.welcomeE;
import levelStagesGUI.*;
public class GamePlay4 extends JPanel{
	Image img;
	Boolean draw = true;
	Boolean roll = false;
	Boolean rock = false;
    Boolean away=false;
    //decisions
    Boolean awayHR=false;
	Boolean rollH = false;
	Boolean rockHRo = false;
	Boolean rollHR = false;
	
	Boolean roro = false;
	Boolean roaw = false;
	Boolean rockaw = false;
	
	int ca=0;
	int checkO=0,checkRL=0,checkRK=0,checkA=0;
	public GamePlay4() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4a.png");
		
		JButton btnBack = new JButton();
		btnBack.setBounds(10, 5, 60, 65);
		btnBack.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ae){
        		draw = false;
        		removeAll();
        		repaint();
        		revalidate();
        		Level4 l4= new Level4();
        		l4.setBounds(0, 0, getWidth(),getHeight());
        		add(l4);
			}
		});
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		add(btnBack);
                
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
       			if (s.equals("roll")&&checkRL==0){
    				roll = true;
    				checkO++;
    				checkRL=1;
    				ca =1;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4b.png");
    				repaint();
    	            revalidate();
    			}
    			
    			if(s.equals("rock")&&checkRK==0){
    				rock= true;
    				checkO++;
    				checkRK=1;
    				ca =1;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4c.png");
    				repaint();
    				revalidate();
    			}
    	        if(s.equals("away")&&checkA==0){
    				away = true;
    				checkO++;
    				checkA=1;
    				ca =1;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4d.png");
    				repaint();
    	            revalidate();
    			}
       		}
       		else if(ca ==1){
       			if(roll){
       				if(s.equals("rock")&&checkRK==0){
        				roll = true;
        				checkO++;
        				checkRK=1;
        				ca =2;
        				roro = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4f.png");
        				repaint();
        				revalidate();
        			}
       				if(s.equals("away")&&checkA==0){
        				away = true;
        				checkO++;
        				checkA=2;
        				ca =1;
        				roaw = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4e.png");
        				repaint();
        	            revalidate();
        			}
       			}
       			else if(rock){
       				if (s.equals("roll")&&checkRL==0){
        				roll = true;
        				checkO++;
        				checkRL=1;
        				ca =2;
        				roro = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4f.png");
        				repaint();
        	            revalidate();
        			}
        	        if(s.equals("away")&&checkA==0){
        				away = true;
        				checkO++;
        				checkA=1;
        				ca =2;
        				rockaw = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4g.png");
        				repaint();
        	            revalidate();
        			}
       			}
       			else if(away){
       				if (s.equals("roll")&&checkRL==0){
        				roll = true;
        				checkO++;
        				checkRL=1;
        				ca =2;
        				roaw = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4e.png");
        				repaint();
        	            revalidate();
        			}
        			
        			if(s.equals("rock")&&checkRK==0){
        				rock = true;
        				checkO++;
        				checkRK=1;
        				ca =2;
        				rockaw = true;
        				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level4/4g.png");
        				repaint();
        				revalidate();
        			}
       			}
       		}
       		else if(ca ==2){
       			if (s.equals("roll")&&checkRL==0){
    				roll = true;
    				checkO++;
    				checkRL=1;
    				ca =3;
    			}
    			
    			if(s.equals("rock")&&checkRK==0){
    				rock = true;
    				checkO++;
    				checkRK=1;
    				ca =3;
    			}
    			if(s.equals("away")&&checkA==0){
    				away = true;
    				checkO++;
    				checkA=1;
    				ca =3;
    			}
       		}
    		
                    
    		if(checkO == 3||ca ==3){
    			draw = false;
    			removeAll();
    			repaint();
    			revalidate();
    			Level5 l5 = new Level5();
    			l5.setBounds(0, 0, getWidth(),getHeight());
                add(l5);
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
