package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Classe permettant de cr�er une fiche d'informations sur l'esp�ce Tigre
 * 
 * @author darco
 *
 */
public class FicheTigre extends JFrame {

	/** JPanel de la fen�tre */
	
	private JPanel panel = new JPanel();
	
	/** titre de la fiche */
	
	private JLabel titre = new JLabel();
	
	/** zone de texte dans laquelle sera inscrit les informations */
	
	private TextArea informations = new TextArea();
	
	/** couleur qui sera utilis�e comme background de la fiche */
	
	private Color grey = new Color(128,128,128);
	
	/**	M�thode principale permettant de la ncer la fen�tre
	 * 
	 * @param args
	 */
	
	public static void main (String [] args) {
		
		FicheTigre fiche = new FicheTigre();
		
		
	}

	/** M�thode constructeur de la classe */
	
	public FicheTigre() {
		
		this.setTitle("Fiche Tigre");
		this.setSize(960,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setLayout(null);
		panel.setBackground(grey);
		
		titre.setText("Fiche Tigre");
		titre.setBounds(380, 30, 300, 100);
		titre.setFont(new Font("Arial Black", Font.PLAIN, 38));
		panel.add(titre);

		informations.setText(" Mange : Herbivores\r\n \r\n Se fait manger par : Carnivores Secondaires "
							+ "\r\n \r\n Qte Vitale Nouritture : 7 \r\n \r\n Valeur en repas : 18 "
							+ "\r\n \r\n Habitat naturel : prairie \r\n \r\n Port�e : 2 ");
		informations.setFont(new Font("Arial Black", Font.PLAIN, 38));
		informations.setBounds(100,180,760,800);
		informations.setBackground(grey);;
		panel.add(informations);
		
		this.setContentPane(panel);
		this.setVisible(true);

}
}