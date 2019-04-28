package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Classe permettant de créer une fiche d'informations sur l'espèce Lapin
 * 
 * @author darco
 *
 */
public class FicheLapin extends JFrame {

	/** JPanel de la fenêtre */
	
	private JPanel panel = new JPanel();
	
	/** titre de la fiche */
	
	private JLabel titre = new JLabel();
	
	/** Zone de texte dans laquelle sera inscrit les informations */
	
	private TextArea informations = new TextArea();
	
	/** Couleur qui sera utilisé comme background pour la fiche */
	
	private Color grey = new Color(128,128,128);
	
	/** Méthode principale permettant de lancer la fenêtre
	 * 
	 * @param args
	 */
	
	public static void main (String [] args) {
		
		FicheLapin fiche = new FicheLapin();
		
		
	}

	/*	Méthode Constructeur de la classe
	 * 
	 */
	public FicheLapin() {
		
		this.setTitle("Fiche Lapin");
		this.setSize(960,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setLayout(null);
		panel.setBackground(grey);
		
		titre.setText("Fiche Lapin");
		titre.setBounds(380, 30, 300, 100);
		titre.setFont(new Font("Arial Black", Font.PLAIN, 38));
		panel.add(titre);

		informations.setText(" Mange : Plantes\r\n \r\n Se fait manger par : Carnivores "
							+ "\r\n \r\n Qte Vitale Nouritture : 7 \r\n \r\n Valeur en repas : 1 "
							+ "\r\n \r\n Habitat naturel : prairie \r\n \r\n Portée : 12 ");
		informations.setFont(new Font("Arial Black", Font.PLAIN, 38));
		informations.setBounds(100,180,760,800);
		informations.setBackground(grey);;
		panel.add(informations);
		
		this.setContentPane(panel);
		this.setVisible(true);

}
}