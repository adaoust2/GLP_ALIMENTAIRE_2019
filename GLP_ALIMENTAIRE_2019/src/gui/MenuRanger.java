package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** MenuRanger est la classe cr�ant la fen�tre du menu principal � partir 
 * d'un JPanel cr�er par la classe BuildPanel
 * 
 * @author darco
 * @see BuildPanel
 *
 */
public class MenuRanger extends JFrame{
	
	/** panel le JPanel de notre fen�tre */
	
	private JPanel panel = new JPanel();
	
	/**
	 * M�thode constructeur de la fen�tre
	 */
public MenuRanger() {
		
	
		this.setTitle("Menu Principal");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new BuildPanel();
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	
	
					}

}