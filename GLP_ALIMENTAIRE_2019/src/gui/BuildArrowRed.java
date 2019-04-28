package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BuildArrowRed extends JPanel {

	
	 public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        
	       
	        
	        Color red = Color.decode("#FF0000");
	        g.setColor(red);
	        
	        g.drawLine(1532, 248, 1532, 278);
	        g.drawLine(1532, 278, 1517, 278);
	        g.drawLine(1517, 278, 1540, 338);
	        g.drawLine(1540, 338, 1562, 280);
	        g.drawLine(1562, 280, 1547, 280);
	        g.drawLine(1547, 280, 1547, 248);
	        g.drawLine(1547, 248, 1532, 248);
	        
	        g.drawLine(1532, 392, 1532, 422);
	        g.drawLine(1532, 422, 1517, 422);
	        g.drawLine(1517, 422,1540 , 482);
	        g.drawLine(1540, 482, 1562, 422);
	        g.drawLine(1562, 422, 1547, 422);
	        g.drawLine(1547, 422, 1547, 392);
	        g.drawLine(1547, 392, 1532, 392);
	        
	        g.drawLine(1532, 536, 1532, 566);
	        g.drawLine(1532, 566, 1517, 566);
	        g.drawLine(1517, 566, 1540, 626);
	        g.drawLine(1540, 626, 1562, 566);
	        g.drawLine(1562, 566, 1547, 566);
	        g.drawLine(1547, 566, 1547, 536);
	        g.drawLine(1547, 536, 1532, 536);  
	    }
		
	}
