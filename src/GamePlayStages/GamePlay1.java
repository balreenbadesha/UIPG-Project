package GamePlayStages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

import levelStagesGUI.*;

public class GamePlay1 extends JPanel{
	Image img;
	//checks
	Boolean door = false;
	Boolean open = false;
	Boolean openH = false;
	Boolean openHD = false;
	Boolean doorHO = false;
	Boolean draw = true;
	
	int checkO=0, checkOp =0, checkDo =0;
	public GamePlay1() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level1/1a.png");
		
		
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
        		Level1 l1 = new Level1();
        		l1.setBounds(0, 0, getWidth(),getHeight());
        		add(l1);
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
		if (s.equals("open")&&checkOp ==0){
			open = true;
			checkO++;
			checkOp = 1;
			img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level1/1b.png");
			repaint();
    		revalidate();
		}
		
		if(s.equals("door")&& checkDo ==0){
			door = true;
			checkO++;
			checkDo =1;
			img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level1/1c.png");
			repaint();
    		revalidate();
		}
		if(checkO == 2){
			draw = false;
    		removeAll();
    		repaint();
    		revalidate();
    		Level2 l2 = new Level2();
    		l2.setBounds(0, 0, getWidth(),getHeight());
    		add(l2);
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
