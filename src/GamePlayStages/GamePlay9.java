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
public class GamePlay9 extends JPanel{
	Image img;
	Boolean draw = true;
	Boolean fox= false;
	Boolean jump = false;
	Boolean reach=false;
    Boolean child=false;
    Boolean childHO=false;
    Boolean reachHO=false;
	Boolean jumpH = false;
	Boolean jumpHD = false;
	Boolean foxHO = false;
	
	
	Boolean foju = false;
	Boolean fore = false;
	Boolean foch = false;
	Boolean jure = false;
	Boolean juch = false;
	Boolean rech =false;
	int ca=0;
	int checkO=0,checkF=0,checkJ=0,checkR=0,checkC=0;
	
	public GamePlay9() 
	{
		setLayout(null);
		img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9a.png");
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
        		Level9 l9= new Level9();
        		l9.setBounds(0, 0, getWidth(),getHeight());
        		add(l9);
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
      			if (s.equals("fox")&&checkF==0){
	   				fox = true;
	   				checkO++;
	   				checkF=1;
	   				ca =1;
	   				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9b.png");
	   				repaint();
	   	            revalidate();
      			}
   			
   			if(s.equals("jump")&&checkJ==0){
   				jump= true;
   				checkO++;
   				checkJ=1;
   				ca =1;
   				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9c.png");
   				repaint();
   				revalidate();
   			}
   	        if(s.equals("reach")&&checkR==0){
   				reach = true;
   				checkO++;
   				checkR=1;
   				ca =1;
   				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9d.png");
   				repaint();
   	            revalidate();
   			}
   	        if(s.equals("child")&&checkC==0){
   	        	child = true;
   				checkO++;
   				checkC=1;
   				ca =1;
   				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9e.png");
   				repaint();
   	            revalidate();
   	        }
      		}
      		//g
      		else if(ca ==1){
      			if(fox){
      				if(s.equals("jump")&&checkJ==0){
       				jump = true;
       				checkO++;
       				checkJ=1;
       				ca =2;
       				foju = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9f.png");
       				repaint();
       				revalidate();
       			}
      				if(s.equals("reach")&&checkR==0){
       				reach = true;
       				checkO++;
       				checkR=2;
       				ca =2;
       				fore = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9i.png");
       				repaint();
       	            revalidate();
       			}
      				if(s.equals("child")&&checkC==0){
      					child = true;
       				checkO++;
       				checkC=1;
       				ca =2;
       				foch = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9j.png");
       				repaint();
       	            revalidate();
      				}
      			}
      			else if(jump){
      				if (s.equals("fox")&&checkF==0){
       				fox = true;
       				checkO++;
       				checkF=1;
       				ca =2;
       				foju = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9f.png");
       				repaint();
       	            revalidate();
       			}
       	        if(s.equals("reach")&&checkR==0){
       				reach = true;
       				checkO++;
       				checkR=1;
       				ca =2;
       				jure = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9m.png");
       				repaint();
       	            revalidate();
       			}
       	        if(s.equals("child")&&checkC==0){
      					child = true;
       				checkO++;
       				checkC=1;
       				ca =1;
       				juch = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9n.png");
       				repaint();
       	            revalidate();
      				}
      			}
      			else if(reach){
      				if (s.equals("fox")&&checkF==0){
       				fox = true;
       				checkO++;
       				checkF=1;
       				ca =2;
       				fore = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9i.png");
       				repaint();
       	            revalidate();
       			}
       			
       			if(s.equals("jump")&&checkJ==0){
       				jump = true;
       				checkO++;
       				checkJ=1;
       				ca =2;
       				jure = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9m.png");
       				repaint();
       				revalidate();
       			}
       			
       			if(s.equals("child")&&checkC==0){
      					child = true;
       				checkO++;
       				checkC=1;
       				ca =2;
       				rech = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9p.png");
       				repaint();
       	            revalidate();
      				}
      			}
      			
      			else if(child){
      				if (s.equals("fox")&&checkF==0){
       				fox = true;
       				checkO++;
       				checkF=1;
       				ca =2;
       				foch = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9j.png");
       				repaint();
       	            revalidate();
       			}
       			
       			if(s.equals("jump")&&checkJ==0){
       				jump = true;
       				checkO++;
       				checkJ=1;
       				ca =2;
       				juch = true;
       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9n.png");
       				repaint();
       				revalidate();
       			}
       			
       			if(s.equals("reach")&&checkR==0){
    				reach = true;
    				checkO++;
    				checkR=1;
    				ca =2;
    				rech = true;
    				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9p.png");
    				repaint();
    	            revalidate();
    			}
      			}
      		}
      		//g
      		else if(ca ==2){
      			if(foju){
      				if(s.equals("reach")&&checkR==0){
	       				reach = true;
	       				checkO++;
	       				checkR=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9g.png");
	       				repaint();
	       	            revalidate();
      				}
      				if(s.equals("child")&&checkC==0){
      					child = true;
	       				checkO++;
	       				checkC=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9k.png");
	       				repaint();
	       	            revalidate();
      				}
      			}
      			else if(fore){
      				if(s.equals("jump")&&checkJ==0){
	       				jump = true;
	       				checkO++;
	       				checkJ=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9g.png");
	       				repaint();
	       				revalidate();
      				}
      				
	      			if(s.equals("child")&&checkC==0){
	      				child = true;
	       				checkO++;
	       				checkC=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9l.png");
	       				repaint();
	       	            revalidate();
	      			}
      				
      			}
      			else if(foch){
      				if(s.equals("reach")&&checkR==0){
	       				reach = true;
	       				checkO++;
	       				checkR=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9l.png");
	       				repaint();
	       	            revalidate();
      				}
      				if(s.equals("jump")&&checkJ==0){
	       				jump = true;
	       				checkO++;
	       				checkJ=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9k.png");
	       				repaint();
	       				revalidate();
      				}
      			}
      			else if(jure){
      				if (s.equals("fox")&&checkF==0){
	       				fox = true;
	       				checkO++;
	       				checkF=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9g.png");
	       				repaint();
	       	            revalidate();
      				}
      				
      				if(s.equals("child")&&checkC==0){
      					child = true;
	       				checkO++;
	       				checkC=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9o.png");
	       				repaint();
	       	            revalidate();
      				}
      			}
      			else if(juch){
      				if (s.equals("fox")&&checkF==0){
	       				fox = true;
	       				checkO++;
	       				checkF=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9k.png");
	       				repaint();
	       	            revalidate();
      				}
      				
      				if(s.equals("reach")&&checkR==0){
	       				reach = true;
	       				checkO++;
	       				checkR=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9o.png");
	       				repaint();
	       	            revalidate();
      				}
      			}
      			else if(rech){
      				if (s.equals("fox")&&checkF==0){
	       				fox = true;
	       				checkO++;
	       				checkF=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9l.png");
	       				repaint();
	       	            revalidate();
      				}
      				if(s.equals("jump")&&checkJ==0){
	       				jump = true;
	       				checkO++;
	       				checkJ=1;
	       				ca =3;
	       				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9o.png");
	       				repaint();
	       				revalidate();
      				}
      				
      			}
      		}
      		else if(ca ==3){
	      			if (s.equals("fox")&&checkF==0){
		   				fox = true;
		   				checkO++;
		   				checkF=1;
		   				ca =4;
	      			}
	   			
	      			if(s.equals("jump")&&checkJ==0){
		   				jump = true;
		   				checkO++;
		   				checkJ=1;
		   				ca =4;
	      			}
		   			if(s.equals("reach")&&checkR==0){
		   				reach = true;
		   				checkO++;
		   				checkR=1;
		   				ca =4;
		   			}
		   			if(s.equals("child")&&checkC==0){
		   				child = true;
		   				checkO++;
		   				checkC=2;
		   				ca =4;
		   				img = Toolkit.getDefaultToolkit().createImage("GamePanel/Level9/9m.jpg");
		   				repaint();
		   	            revalidate();
		   			}
      		}
   		
                   
   		if(checkO == 4||ca ==4){
   			draw = false;
   			removeAll();
   			repaint();
            revalidate();
            Level10 l10 = new Level10();
            l10.setBounds(0, 0, getWidth(),getHeight());
            add(l10);
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
