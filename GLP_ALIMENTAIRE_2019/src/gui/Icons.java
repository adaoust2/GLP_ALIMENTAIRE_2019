package gui;

import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Icons extends JPanel{

	private JPanel panel_green;
	private JPanel panel_yellow;
	private JPanel panel_black;

	 
	 

	public JPanel getPanel_green() {
		return panel_green;
	}
	public JPanel getPanel_yellow() {
		return panel_yellow;
	}
	public Icons() {
	  init();
        
	}
	private void init() {
		panel_green = new JPanel();
		panel_green.setBounds(17, 101, 549, 763);
		panel_green.setLayout(null);
		Fenetre.getFen().add(panel_green);
		
		
		/*JPanel panel_yellow = new JPanel();
		Color yellow = Color.decode("#FFCC66");
		panel_yellow.setBounds(564, 101, 549, 763);
		panel_green.setLayout(null);
		panel_yellow.setBackground(yellow);
		Fenetre.getFen().add(panel_yellow);-*/
		
		
        JPanel panel_black = new JPanel();
        Color black = Color.decode("000000");
        panel_black.setBounds(1122, 0, 18, 1020);
        panel_black.setBackground(black);
        Fenetre.getFen().add(panel_black);
        
	}
}
