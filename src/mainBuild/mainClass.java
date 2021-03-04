package mainBuild;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class mainClass extends JFrame{

public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					welcomeE welcomePage = new welcomeE();
					mainClass frame = new mainClass();
					frame.setTitle("Escape With Mind");
					ImageIcon logo = new ImageIcon("icon.png");
					frame.setIconImage(logo.getImage());
					frame.getContentPane().add(welcomePage);
					frame.setPreferredSize(new Dimension(1024,760));
					frame.setVisible(true);
					frame.pack();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					
					
					Music playMusic = new Music();
					Thread music = new Thread(playMusic);
					music.start();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}
