import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FicheMouton extends JFrame {

	private JPanel panel = new JPanel();
	private JLabel titre = new JLabel();
	private TextArea informations = new TextArea();
	private Color orange = new Color(128,128,128);
	
	public static void main (String [] args) {
		
		FicheMouton fiche = new FicheMouton();
		
		
	}

	public FicheMouton() {
		
		this.setTitle("Fiche Mouton");
		this.setSize(960,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setLayout(null);
		panel.setBackground(orange);
		
		titre.setText("Fiche Mouton");
		titre.setBounds(380, 30, 300, 100);
		titre.setFont(new Font("Arial Black", Font.PLAIN, 38));
		panel.add(titre);

		informations.setText(" Mange : Plantes\r\n \r\n Se fait manger par : Carnivores "
							+ "\r\n \r\n Qte Vitale Nouritture : 14 \r\n \r\n Valeur en repas : 7 "
							+ "\r\n \r\n Habitat naturel : prairie \r\n \r\n Port�e : 4 ");
		informations.setFont(new Font("Arial Black", Font.PLAIN, 38));
		informations.setBounds(100,180,760,800);
		informations.setBackground(orange);;
		panel.add(informations);
		
		this.setContentPane(panel);
		this.setVisible(true);

}
}