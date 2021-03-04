package GamePlayStages;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import levelStagesGUI.*;
import mainBuild.CharacterStoryEnd;
import mainBuild.welcomeE;

public class GamePlay10 extends JPanel{
	Image img;
	Boolean draw = true;
        
    Boolean keys = false;
	Boolean flower = false;
    Boolean carpet=false;
    Boolean unlock=false;
    Boolean door=false;
    Boolean carpetHO=false;
    Boolean unlockHO=false;
    Boolean doorHO=false;
	Boolean flowerH = false;
	Boolean flowerHD = false;
	Boolean keysHO = false;
        
   int checkO=0,checkD,checkP,checkS,checkL,checkW;;
	public GamePlay10() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level10/10a.png");
		
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
        		Level10 l10= new Level10();
        		l10.setBounds(0, 0, getWidth(),getHeight());
        		add(l10);
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
		if (s.equals("keys")&&checkD==0){
				keys = true;
				checkO++;
				checkD=1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level10/10b.png");
				repaint();
	            revalidate();
			}
		
		if(keys){
			if(s.equals("flower")&&checkP==0){
				flower = true;
				checkO++;
				checkP=1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level10/10c.png");
				repaint();
	            revalidate();
			}
		}
		if(flower){
			if(s.equals("carpet")&&checkS==0){
				carpet = true;
				checkO++;
				checkS=1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level10/10d.png");
				repaint();
	            revalidate();
			}
		}
		if(carpet){
			if(s.equals("unlock")&&checkL==0){
				unlock = true;
				checkO++;
				checkL=1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level10/10e.png");
				repaint();
	            revalidate();
			}
		}
		
		if(unlock){
			if(s.equals("door")&&checkW==0){
				door = true;
				checkO++;
				checkW=1;
				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level10/10f.png");
				repaint();
	            revalidate();
			}
		}
                
		if(checkO == 5){
			draw = false;
            removeAll();
            repaint();
            revalidate();
            CharacterStoryEnd end = new CharacterStoryEnd();
            end.setBounds(0, 0, getWidth(),getHeight());
            add(end);
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
