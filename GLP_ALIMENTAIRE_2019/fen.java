import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.JSplitPane;
import java.awt.Choice;

public class fen {

	private JFrame frame;
	private JTextField txtCompteur_1;
	private JTextField txtCompteur_2;
	private JTextField txtCompteur;
	private JTextField txtCompteur_3;
	private JTextField txtCompteur_4;
	private JButton btnLapin;
	private JButton btnChevre;
	private JButton btnSerpent;
	private JButton btnLoup;
	private JButton btnOurs;
	private JTextField txtSemaine;
	private JButton btnSemaineSuivante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fen window = new fen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPause = new JButton("Pause");
		btnPause.setBounds(335, 230, 97, 25);
		frame.getContentPane().add(btnPause);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(0, 230, 97, 25);
		frame.getContentPane().add(btnExit);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(84, 216, 262, 1);
		frame.getContentPane().add(horizontalStrut);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(94, 228, 240, -11);
		frame.getContentPane().add(horizontalGlue);
		
		txtCompteur_1 = new JTextField();
		txtCompteur_1.setText("Compteur 1");
		txtCompteur_1.setBounds(0, 1, 86, 22);
		frame.getContentPane().add(txtCompteur_1);
		txtCompteur_1.setColumns(10);
		
		txtCompteur_2 = new JTextField();
		txtCompteur_2.setText("Compteur 2");
		txtCompteur_2.setColumns(10);
		txtCompteur_2.setBounds(0, 36, 86, 22);
		frame.getContentPane().add(txtCompteur_2);
		
		txtCompteur = new JTextField();
		txtCompteur.setText("Compteur 3\r\n\r\n");
		txtCompteur.setColumns(10);
		txtCompteur.setBounds(0, 71, 86, 22);
		frame.getContentPane().add(txtCompteur);
		
		txtCompteur_3 = new JTextField();
		txtCompteur_3.setText("Compteur 4");
		txtCompteur_3.setColumns(10);
		txtCompteur_3.setBounds(0, 103, 86, 22);
		frame.getContentPane().add(txtCompteur_3);
		
		txtCompteur_4 = new JTextField();
		txtCompteur_4.setText("Compteur 5");
		txtCompteur_4.setColumns(10);
		txtCompteur_4.setBounds(0, 138, 86, 22);
		frame.getContentPane().add(txtCompteur_4);
		
		btnLapin = new JButton("Lapin");
		btnLapin.setBounds(335, 0, 97, 25);
		frame.getContentPane().add(btnLapin);
		
		btnChevre = new JButton("Chevre");
		btnChevre.setBounds(335, 38, 97, 25);
		frame.getContentPane().add(btnChevre);
		
		btnSerpent = new JButton("Serpent");
		btnSerpent.setBounds(335, 76, 97, 25);
		frame.getContentPane().add(btnSerpent);
		
		btnLoup = new JButton("Loup");
		btnLoup.setBounds(335, 114, 97, 25);
		frame.getContentPane().add(btnLoup);
		
		btnOurs = new JButton("Ours");
		btnOurs.setBounds(335, 152, 97, 25);
		frame.getContentPane().add(btnOurs);
		
		txtSemaine = new JTextField();
		txtSemaine.setText("Semaine 1");
		txtSemaine.setBounds(94, 231, 106, 22);
		frame.getContentPane().add(txtSemaine);
		txtSemaine.setColumns(10);
		
		btnSemaineSuivante = new JButton("Semaine suivante");
		btnSemaineSuivante.setBounds(201, 230, 133, 25);
		frame.getContentPane().add(btnSemaineSuivante);
	}
}
