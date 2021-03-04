package GamePlayStages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import levelStagesGUI.*;
import mainBuild.welcomeE;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class GamePlay6 extends JPanel{
	Image img;
	Boolean draw = true;
        
    Boolean give = false;
	Boolean bear = false;
	Boolean lime=false;
    Boolean limeHO=false;
	Boolean bearH = false;
	Boolean bearHD = false;
	Boolean giveHO = false;
	
	Boolean gibe = false;
	Boolean gili = false;
	Boolean beli = false;
	int ca=0;
	int checkO=0,checkG=0,checkB=0,checkL=0;
	
	public GamePlay6() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6a.png");
		
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
        		Level6 l6= new Level6();
        		l6.setBounds(0, 0, getWidth(),getHeight());
        		add(l6);
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
   			if (s.equals("give")&&checkG==0){
				give = true;
				checkO++;
				checkG=1;
				ca =1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6b.png");
				repaint();
	            revalidate();
			}
			
			if(s.equals("bear")&&checkB==0){
				bear= true;
				checkO++;
				checkB=1;
				ca =1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6c.png");
				repaint();
				revalidate();
			}
	        if(s.equals("lime")&&checkL==0){
				lime = true;
				checkO++;
				checkL=1;
				ca =1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6d.png");
				repaint();
	            revalidate();
			}
   		}
   		else if(ca ==1){
   			if(give){
   				if(s.equals("bear")&&checkB==0){
    				give = true;
    				checkO++;
    				checkB=1;
    				ca =2;
    				gibe = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6f.png");
    				repaint();
    				revalidate();
    			}
   				if(s.equals("lime")&&checkL==0){
    				lime = true;
    				checkO++;
    				checkL=2;
    				ca =1;
    				gili = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6e.png");
    				repaint();
    	            revalidate();
    			}
   			}
   			else if(bear){
   				if (s.equals("give")&&checkG==0){
    				give = true;
    				checkO++;
    				checkG=1;
    				ca =2;
    				gibe = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6f.png");
    				repaint();
    	            revalidate();
    			}
    	        if(s.equals("lime")&&checkL==0){
    				lime = true;
    				checkO++;
    				checkL=1;
    				ca =2;
    				beli = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6g.png");
    				repaint();
    	            revalidate();
    			}
   			}
   			else if(lime){
   				if (s.equals("give")&&checkG==0){
    				give = true;
    				checkO++;
    				checkG=1;
    				ca =2;
    				gili = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6e.png");
    				repaint();
    	            revalidate();
    			}
    			
    			if(s.equals("bear")&&checkB==0){
    				bear = true;
    				checkO++;
    				checkB=1;
    				ca =2;
    				beli = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level6/6g.png");
    				repaint();
    				revalidate();
    			}
   			}
   		}
   		else if(ca ==2){
   			if (s.equals("give")&&checkG==0){
				give = true;
				checkO++;
				checkG=1;
				ca =3;
			}
			
			if(s.equals("bear")&&checkB==0){
				bear = true;
				checkO++;
				checkB=1;
				ca =3;
			}
			if(s.equals("lime")&&checkL==0){
				lime = true;
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
            Level7 l7 = new Level7();
            l7.setBounds(0, 0, getWidth(),getHeight());
            add(l7);
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
