package GamePlayStages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

import mainBuild.welcomeE;
import levelStagesGUI.*;

public class GamePlay5 extends JPanel{
	Image img;
	Boolean draw = true;
	Boolean jump = false;
    Boolean over = false;
    Boolean hole=false;
    Boolean holeHO=false;
    Boolean overH = false;
    Boolean overHD = false;
    Boolean jumpHO = false;
    
    Boolean juov = false;
	Boolean juho = false;
	Boolean ovho = false;
	int ca=0;
	int checkO=0,checkJ=0,checkOv=0,checkH=0;
	public GamePlay5() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5a.png");
		
                
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
                        Level5 l5= new Level5();
        		l5.setBounds(0, 0, getWidth(),getHeight());
        		add(l5);
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
    			if (s.equals("jump")&&checkJ==0){
 				jump = true;
 				checkO++;
 				checkJ=1;
 				ca =1;
 				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5b.png");
 				repaint();
 	            revalidate();
 			}
 			
 			if(s.equals("over")&&checkOv==0){
 				over= true;
 				checkO++;
 				checkOv=1;
 				ca =1;
 				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5c.png");
 				repaint();
 				revalidate();
 			}
 	        if(s.equals("hole")&&checkH==0){
 				hole = true;
 				checkO++;
 				checkH=1;
 				ca =1;
 				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5d.png");
 				repaint();
 	            revalidate();
 			}
    		}
    		else if(ca ==1){
    			if(jump){
    				if(s.equals("over")&&checkOv==0){
     				jump = true;
     				checkO++;
     				checkOv=1;
     				ca =2;
     				juov = true;
     				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5e.png");
     				repaint();
     				revalidate();
     			}
    				if(s.equals("hole")&&checkH==0){
     				hole = true;
     				checkO++;
     				checkH=2;
     				ca =2;
     				juho = true;
     				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5f.png");
     				repaint();
     	            revalidate();
     			}
    			}
    			else if(over){
    				if (s.equals("jump")&&checkJ==0){
     				jump = true;
     				checkO++;
     				checkJ=1;
     				ca =2;
     				juov = true;
     				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5e.png");
     				repaint();
     	            revalidate();
     			}
     	        if(s.equals("hole")&&checkH==0){
     				hole = true;
     				checkO++;
     				checkH=1;
     				ca =2;
     				ovho = true;
     				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5g.png");
     				repaint();
     	            revalidate();
     			}
    			}
    			else if(hole){
    				if (s.equals("jump")&&checkJ==0){
     				jump = true;
     				checkO++;
     				checkJ=1;
     				ca =2;
     				juho = true;
     				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5f.jpg");
     				repaint();
     	            revalidate();
     			}
     			
     			if(s.equals("over")&&checkOv==0){
     				over = true;
     				checkO++;
     				checkOv=1;
     				ca =2;
     				ovho = true;
     				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level5/5g.jpg");
     				repaint();
     				revalidate();
     			}
    			}
    		}
    		else if(ca ==2){
    			if (s.equals("jump")&&checkJ==0){
 				jump = true;
 				checkO++;
 				checkJ=1;
 				ca =3;
 			}
 			
 			if(s.equals("over")&&checkOv==0){
 				over = true;
 				checkO++;
 				checkOv=1;
 				ca =3;
 			}
 			if(s.equals("hole")&&checkH==0){
 				hole = true;
 				checkO++;
 				checkH=1;
 				ca =3;
 			}
    		}
 		
                 
 		if(checkO == 3||ca ==3){
 			draw = false;
 			removeAll();
             repaint();
             revalidate();
             Level6 l6 = new Level6();
             l6.setBounds(0, 0, getWidth(),getHeight());
             add(l6);
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
