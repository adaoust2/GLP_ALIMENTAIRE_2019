package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** MenuRanger est la classe créant la fenêtre du menu principal à partir 
 * d'un JPanel créer par la classe BuildPanel
 * 
 * @author darco
 * @see BuildPanel
 *
 */
public class MenuRanger extends JFrame{
	
	/** panel le JPanel de notre fenêtre */
	
	private JPanel panel = new JPanel();
	
	/**
	 * Méthode constructeur de la fenêtre
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