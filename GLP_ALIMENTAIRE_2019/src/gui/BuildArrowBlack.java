package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BuildArrowBlack extends JLabel implements Runnable{

	Color color = null ;
	
	 private static BuildArrowBlack instance = new BuildArrowBlack();
	 

	public static BuildArrowBlack getInstance() {
		return instance;
	}
	
	   private BufferedImage image;
	   private BufferedImage image1;
	public BuildArrowBlack() {
		this.setLayout(null);
		this.setBounds(375, 248, 600, 400);
		 try {                
	          image = ImageIO.read(new File("src/image/arrow.png"));
	          image1 = ImageIO.read(new File("src/image/arrow2.png"));
	       } catch (IOException ex) {
	            
	       }
		 run();
	}
	@Override
	 public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	       
	        g.drawImage(image,0 ,0 , 90,90, this);
	        g.drawImage(image, 0, 140, 90,90, this);
	        g.drawImage(image, 0, 285, 90,90, this);
	       /* g.setColor(color);
	        g.drawLine(15, 0, 15, 30);
	        g.drawLine(15, 30, 0, 30);
	        g.drawLine(0, 30, 23, 80);
	        g.drawLine(23, 80, 45, 30);
	        g.drawLine(45, 30, 30, 30);
	        g.drawLine(30, 30, 30, 0);
	        g.drawLine(30, 0, 15, 0);
	        
	        g.drawLine(15, 144, 15, 174);
	        g.drawLine(15, 174, 0, 174);
	        g.drawLine(0, 174,  23, 224);
	        g.drawLine(23, 224, 45, 174);
	        g.drawLine(45, 174, 30, 174);
	        g.drawLine(30, 174, 30, 144);
	        g.drawLine(30, 144, 15, 144);
	        
	        g.drawLine(15, 288, 15, 318);
	        g.drawLine(15, 318, 0, 318);
	        g.drawLine(0, 318, 23, 368);
	        g.drawLine(23, 368, 45, 318);
	        g.drawLine(45, 318, 30, 318);
	        g.drawLine(30, 318, 30, 288);
	        g.drawLine(30, 288, 15, 288);  */
	    }
	@Override
	public void run() {
		try {
			Thread.sleep(10);
			image=ImageIO.read(new File("src/image/arrow2.png"));
			this.repaint();
		}catch (Exception e) {
		}
	
		
	}

		
	}