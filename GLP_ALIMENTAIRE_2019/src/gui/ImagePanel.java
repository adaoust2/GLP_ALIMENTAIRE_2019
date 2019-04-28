package gui;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.DataHashmap;

public class ImagePanel extends JPanel{

    private BufferedImage image;
    private BufferedImage image1;
    private BufferedImage image2;
    private BufferedImage image3;
    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("src/image/prairie2.png"));
          image1 = ImageIO.read(new File("src/image/montagne.png"));
          image2 = ImageIO.read(new File("src/image/glace.png"));
          image3 = ImageIO.read(new File("src/image/desert.png"));
       } catch (IOException ex) {
            
       }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int j=0;j<=400;j+=50) {
        	for(int i=0;i<=400;i+=50) {
        		g.drawImage(image, i, j, 50, 50, this); // see javadoc for more info on the parameters 
        		g.drawImage(image1, i+450, j, 50, 50, this);
        		g.drawImage(image2, i, j+500, 50, 50, this);
        		g.drawImage(image3, i+450, j+500, 50, 50, this);
        	}
    	}
    }
}