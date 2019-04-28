package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import data.Map;

/** Classe permettant de construire un JPanel qui sera utilisé plus tard
 * pour construire le Menu Principal
 * 
 * @author darco
 * @see MenuRanger
 */

public class BuildPanel extends JPanel {

	/**
	 * HashMap contenant les Valeurs rentrées par l'utilisateur pour chaque espèces
	 */
	private static HashMap<Integer,Integer> CA = new HashMap<Integer,Integer>();
	
	/**
	 * valeurs des nombres d'animaux présents dans l'écosystème 
	 */
	
	private int ValLapin;
	private int ValVache;
	private int ValPanda;
	private int ValChevre;
	private int ValPoule;
	private int ValMouton;
	private int ValPanthere;
	private int ValLoup;
	private int ValPanthereNeige;
	private int ValSerpent;
	private int ValTigre;
	private int ValOurs;
	
	/**
	 * Boutons des animaux du Menu Principal
	 * 1 bouton par espèce
	 */
	
	private JToggleButton btnLapin =  new JToggleButton (new ImageIcon("src/ImagesBoutons/Lapin.jpg"));
	private JToggleButton btnVache = new JToggleButton(new ImageIcon("src/ImagesBoutons/Vache.jpg"));
	private JToggleButton btnPanda = new JToggleButton(new ImageIcon("src/ImagesBoutons/Panda.jpg"));
	private JToggleButton btnChevre = new JToggleButton(new ImageIcon("src/ImagesBoutons/Chevre.jpg"));
	private JToggleButton btnPoule = new JToggleButton(new ImageIcon("src/ImagesBoutons/Poule.jpg"));
	private JToggleButton btnMouton = new JToggleButton(new ImageIcon("src/ImagesBoutons/Mouton.jpg"));
	private JToggleButton btnPanthere = new JToggleButton(new ImageIcon("src/ImagesBoutons/Panthere.jpg"));
	private JToggleButton btnLoup = new JToggleButton(new ImageIcon("src/ImagesBoutons/Loup.jpg"));
	private JToggleButton btnPanthereNeige = new JToggleButton(new ImageIcon("src/ImagesBoutons/PanthereNeige.jpg"));
	private JToggleButton btnSerpent = new JToggleButton(new ImageIcon("src/ImagesBoutons/Serpent.jpg"));
	private JToggleButton btnTigre = new JToggleButton(new ImageIcon("src/ImagesBoutons/Tigre.jpg"));
	private JToggleButton btnOurs = new JToggleButton(new ImageIcon("src/ImagesBoutons/Ours.jpg"));
	
	/**
	 * Boutons permettant l'incrémentation et la décrémentation 
	 * des valeurs de chaque espèces à intégrer dans l'écosystème
	 */
	
	private JButton PlusLapin = new JButton("+");
	private JButton PlusVache = new JButton("+");
	private JButton PlusPanda = new JButton("+");
	private JButton PlusChevre = new JButton("+");
	private JButton PlusMouton = new JButton("+");
	private JButton PlusPoule = new JButton("+");
	private JButton PlusPanthere = new JButton("+");
	private JButton PlusLoup = new JButton("+");
	private JButton PlusPanthereNeige = new JButton("+");
	private JButton PlusSerpent = new JButton("+");
	private JButton PlusTigre = new JButton("+");
	private JButton PlusOurs = new JButton("+");
	
	private JButton MinusLapin = new JButton("-");
	private JButton MinusVache = new JButton("-");
	private JButton MinusPanda = new JButton("-");
	private JButton MinusChevre = new JButton("-");
	private JButton MinusPoule = new JButton("-");
	private JButton MinusMouton = new JButton("-");
	private JButton MinusPanthere = new JButton("-");
	private JButton MinusLoup = new JButton("-");
	private JButton MinusPanthereNeige = new JButton("-");
	private JButton MinusSerpent = new JButton("-");
	private JButton MinusTigre = new JButton("-");
	private JButton MinusOurs = new JButton("-");
	
	/** Bouton permettant de lancer la simulation à partir des informations saisies avec le Menu Principal */
	
	private JButton btnNext = new JButton("Next");
	
	/** Bouton permettant de réinitialiser les valeurs de chaque espèce*/
	
	private JButton btnReset = new JButton("Reset");
	
	/** Consigne du Menu Principal*/
	
	private JLabel titre = new JLabel("Choisissez vos espèces");
	
	/**
	 * TextFields dans lesquels seront affiché le nombre d'animaux
	 *  à insérer dans l'écosystème pour chaque espèce
	 */
	
	private JTextField textLapin = new JTextField("0");
	private JTextField textVache = new JTextField("0");
	private JTextField textPanda = new JTextField("0");
	private JTextField textChevre = new JTextField("0");
	private JTextField textPoule = new JTextField("0");
	private JTextField textMouton = new JTextField("0");
	private JTextField textPanthere = new JTextField("0");
	private JTextField textLoup = new JTextField("0");
	private JTextField textPanthereNeige = new JTextField("0");
	private JTextField textSerpent = new JTextField("0");
	private JTextField textTigre = new JTextField("0");
	private JTextField textOurs = new JTextField("0");
	
	/**
	 * Méthode Constructeur de la classe
	 */
	
	public BuildPanel() {
		
		this.setLayout(null);
		
		
		titre.setBounds(485, 30, 1150, 40);
		titre.setFont(new Font("Arial Black", Font.PLAIN, 38));
		this.add(titre);
		
		
		btnLapin.setBounds(40, 145, 430, 160);
		btnLapin.addActionListener(new LapinListener());
		this.add(btnLapin);
		
		btnVache.addActionListener(new VacheListener());
		this.add(btnVache);
		btnVache.setBounds(40, 385, 430, 160);
		
		btnPanda.addActionListener(new PandaListener());
		this.add(btnPanda);
		btnPanda.setBounds(40, 625, 430, 160);
		
		btnChevre.addActionListener(new ChevreListener());
		this.add(btnChevre);
		btnChevre.setBounds(510, 145, 430, 160);
		
		btnPoule.addActionListener(new PouleListener());
		this.add(btnPoule);
		btnPoule.setBounds(510, 385, 430, 160);
		
		btnMouton.addActionListener(new MoutonListener());
		this.add(btnMouton);
		btnMouton.setBounds(510, 625, 430, 160);
		
		btnPanthere.addActionListener(new PanthereListener());
		this.add(btnPanthere);
		btnPanthere.setBounds(980, 145, 430, 160);
		
		btnLoup.addActionListener(new LoupListener());
		this.add(btnLoup);
		btnLoup.setBounds(980, 385, 430, 160);
		
		btnPanthereNeige.addActionListener(new PanthereNeigeListener());
		this.add(btnPanthereNeige);
		btnPanthereNeige.setBounds(980, 625, 430, 160);
		
		btnSerpent.addActionListener(new SerpentListener());
		this.add(btnSerpent);
		btnSerpent.setBounds(1450,145 , 430, 160);
		
		btnTigre.addActionListener(new TigreListener());
		this.add(btnTigre);
		btnTigre.setBounds(1450, 385, 430, 160);
		
		btnOurs.addActionListener(new OursListener());
		btnOurs.setBounds(1450, 625, 430, 160);
		this.add(btnOurs);
		
		btnNext.addActionListener(new NextListener());
		btnNext.setBounds(760,880 , 200, 100);
		this.add(btnNext);
		
		btnReset.addActionListener(new ResetListener());
		btnReset.setBounds(960, 880, 200, 100);
		this.add(btnReset);
		
		textLapin.setBounds(90, 305, 330,50 );
		textLapin.setHorizontalAlignment(JTextField.CENTER);
		textLapin.setEditable(false);
		this.add(textLapin);
		MinusLapin.setBounds(40, 305, 50, 50);
		MinusLapin.addActionListener(new MinusLapinListener());
		this.add(MinusLapin);
		PlusLapin.setBounds(420, 305, 50, 50);
		PlusLapin.addActionListener(new PlusLapinListener());
		this.add(PlusLapin);
		 
		textVache.setBounds(90, 545, 330,50 );
		textVache.setHorizontalAlignment(JTextField.CENTER);
		textVache.setEditable(false);
		this.add(textVache);
		MinusVache.setBounds(40, 545, 50, 50);
		MinusVache.addActionListener(new MinusVacheListener());
		this.add(MinusVache);
		PlusVache.setBounds(420, 545, 50, 50);
		PlusVache.addActionListener(new PlusVacheListener());
		this.add(PlusVache);
		 
		textPanda.setBounds(90, 785, 330,50 );
		textPanda.setHorizontalAlignment(JTextField.CENTER);
		textPanda.setEditable(false);
		this.add(textPanda);
		MinusPanda.setBounds(40,785,50,50);
		MinusPanda.addActionListener(new MinusPandaListener());
		this.add(MinusPanda);
		PlusPanda.setBounds(420, 785, 50, 50);
		PlusPanda.addActionListener(new PlusPandaListener());
		this.add(PlusPanda);
		 
		textPoule.setBounds(560, 545, 330,50 );
		textPoule.setHorizontalAlignment(JTextField.CENTER);
		textPoule.setEditable(false);
		this.add(textPoule);
		MinusPoule.setBounds(510, 545, 50, 50);
		MinusPoule.addActionListener(new MinusPouleListener());
		this.add(MinusPoule);
		PlusPoule.setBounds(890, 545, 50, 50);
		PlusPoule.addActionListener(new PlusPouleListener());
		this.add(PlusPoule);
		 
		textChevre.setBounds(560, 305, 330,50 );
		textChevre.setHorizontalAlignment(JTextField.CENTER);
		textChevre.setEditable(false);
		this.add(textChevre);
		MinusChevre.setBounds(510, 305, 50, 50);
		MinusChevre.addActionListener(new MinusChevreListener());
		this.add(MinusChevre);
		PlusChevre.setBounds(890, 305, 50, 50);
		PlusChevre.addActionListener(new PlusChevreListener());
		this.add(PlusChevre);
		 
		textMouton.setBounds(560, 785, 330,50 );
		textMouton.setHorizontalAlignment(JTextField.CENTER);
		textMouton.setEditable(false);
		this.add(textMouton);
		MinusMouton.setBounds(510, 785, 50, 50);
		MinusMouton.addActionListener(new MinusMoutonListener());
		this.add(MinusMouton);
		PlusMouton.setBounds(890, 785, 50, 50);
		PlusMouton.addActionListener(new PlusMoutonListener());
		this.add(PlusMouton);
		
		textPanthere.setBounds(1030, 305, 330,50 );
		textPanthere.setHorizontalAlignment(JTextField.CENTER);
		textPanthere.setEditable(false);
		this.add(textPanthere);
		MinusPanthere.setBounds(980, 305, 50, 50);
		MinusPanthere.addActionListener(new MinusPanthereListener());
		this.add(MinusPanthere);
		PlusPanthere.setBounds(1360, 305, 50, 50);
		PlusPanthere.addActionListener(new PlusPanthereListener());
		this.add(PlusPanthere);
		 
		textLoup.setBounds(1030, 545, 330,50 );
		textLoup.setHorizontalAlignment(JTextField.CENTER);
		textLoup.setEditable(false);
		this.add(textLoup);
		MinusLoup.setBounds(980, 545, 50, 50);
		MinusLoup.addActionListener(new MinusLoupListener());
		this.add(MinusLoup);
		PlusLoup.setBounds(1360, 545, 50, 50);
		PlusLoup.addActionListener(new PlusLoupListener());
		this.add(PlusLoup);
		
		textPanthereNeige.setBounds(1030, 785, 330,50 );
		textPanthereNeige.setHorizontalAlignment(JTextField.CENTER);
		textPanthereNeige.setEditable(false);
		this.add(textPanthereNeige);
		MinusPanthereNeige.setBounds(980, 785, 50, 50);
		MinusPanthereNeige.addActionListener(new MinusPanthereNeigeListener());
		this.add(MinusPanthereNeige);
		PlusPanthereNeige.setBounds(1360, 785, 50, 50);
		PlusPanthereNeige.addActionListener(new PlusPanthereNeigeListener());
		this.add(PlusPanthereNeige);
		 
		textSerpent.setBounds(1500, 305, 330,50 );
		textSerpent.setHorizontalAlignment(JTextField.CENTER);
		textSerpent.setEditable(false);
		this.add(textSerpent);
		MinusSerpent.setBounds(1450, 305, 50, 50);
		MinusSerpent.addActionListener(new MinusSerpentListener());
		this.add(MinusSerpent);
		PlusSerpent.setBounds(1830, 305, 50, 50);
		PlusSerpent.addActionListener(new PlusSerpentListener());
		this.add(PlusSerpent);
		
		textTigre.setBounds(1500, 545, 330,50 );
		textTigre.setHorizontalAlignment(JTextField.CENTER);
		textTigre.setEditable(false);
		this.add(textTigre);
		MinusTigre.setBounds(1450, 545, 50, 50);
		MinusTigre.addActionListener(new MinusTigreListener());
		this.add(MinusTigre);
		PlusTigre.setBounds(1830, 545, 50, 50);
		PlusTigre.addActionListener(new PlusTigreListener());
		this.add(PlusTigre);
		
		textOurs.setBounds(1500, 785, 330,50 );
		textOurs.setHorizontalAlignment(JTextField.CENTER);
		textOurs.setEditable(false);
		this.add(textOurs);
		MinusOurs.setBounds(1450, 785, 50, 50);
		MinusOurs.addActionListener(new MinusOursListener());
		this.add(MinusOurs);
		PlusOurs.setBounds(1830, 785, 50, 50);
		PlusOurs.addActionListener(new PlusOursListener());
		this.add(PlusOurs);
		
	}
	
	/** Méthode retournant la HashMap
	 * 
	 * @return CA la HashMap contenant les informations sur le nombre
	 * d'animaux présent dans l'écosystème pour chaque espèce
	 */
	public static HashMap<Integer, Integer> getCA() {
		return CA;
	}

	/** Classe interne, ActionListener pour le bouton "Reset"
	  permettant de réinitialiser toutes les valeurs du Menu lorsque
	  l'utilisateur clique sur le bouton*/
	
	class ResetListener implements ActionListener {
		
		/**
		 * Méthode permettant de réinitialiser toutes les valeurs à 0
		 * @param arg0
		 */
		public void actionPerformed(ActionEvent arg0) {
			
			textLapin.setText("0");
			textVache.setText("0");
			textPanda.setText("0");
			textChevre.setText("0");
			textPoule.setText("0");
			textMouton.setText("0");
			textPanthere.setText("0");
			textLoup.setText("0");
			textPanthereNeige.setText("0");
			textSerpent.setText("0");
			textTigre.setText("0");
			textOurs.setText("0");
		}
	}
	
	/** Classe interne, ActionListener pour le bouton "Next"
	 * permettant de lancer la simulation à partir des informations
	 * rentrées par l'utilisateur depuis le Menu Principal
	 * @author darco
	 *
	 */
	
	class NextListener implements ActionListener {
		
		/** Méthode permettant de lancer la simulation
		 * 	@param arg0
		 */
		public void actionPerformed(ActionEvent arg0) {
			Map map = new Map();
			
		}
	}
	
	/** Classe interne, ActionListener pour le bouton "btnLapin"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class LapinListener implements ActionListener{ 
		int bool=0;
		@Override 
		
		/** Méthode permettant de changer l'image et de rentrer la valeur des Lapin dans la hasmap
		 * @param arg0
		 */
		public void actionPerformed(ActionEvent arg0) {
		
		if(bool==0){
			 btnLapin.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
			 CA.put(7, ValLapin);
			 bool=1; 
		}
		else if(bool==1) {
			btnLapin.setIcon(new ImageIcon("src/ImagesBoutons/Lapin.jpg"));
			CA.remove(7);
			bool=0;
		}
		
	}
	}
		
	/** Classe interne, ActionListener pour le bouton "btnVache"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	
	class VacheListener implements ActionListener {

		int bool=0;
		@Override
		
		/**
		 * Méthode permettant de changer l'image et de rentrer la valeur des Vaches dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			if(bool==0){
				 btnVache.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(3, ValVache);
				 bool=1; 
			}
			else if(bool==1) {
				btnVache.setIcon(new ImageIcon("src/ImagesBoutons/Vache.jpg"));
				CA.remove(3);
				bool=0;
			}
			
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnPanda"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class PandaListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Pandas dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPanda.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(5, ValPanda);
				 bool=1; 
			}
			else if(bool==1) {
				btnPanda.setIcon(new ImageIcon("src/ImagesBoutons/Panda.jpg"));
				CA.remove(5);
				bool=0;
			}
		}
		
	}
		
	/** Classe interne, ActionListener pour le bouton "btnChevre"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class ChevreListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Chevres dans la hasmap
		 * 	@param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(bool==0){
				 btnChevre.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(4, ValChevre);
				 bool=1; 
			}
			else if(bool==1) {
				btnChevre.setIcon(new ImageIcon("src/ImagesBoutons/Chevre.jpg"));
				CA.remove(4);
				bool=0;
			}
		}
		
	}

	/** Classe interne, ActionListener pour le bouton "btnPoule"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class PouleListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Poules dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPoule.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(2, ValPoule);
				 bool=1; 
			}
			else if(bool==1) {
				btnPoule.setIcon(new ImageIcon("src/ImagesBoutons/Poule.jpg"));
				CA.remove(2);
				bool=0;
			}
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnMouton"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class MoutonListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Moutons dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnMouton.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(8, ValMouton);
				 bool=1; 
			}
			else if(bool==1) {
				btnMouton.setIcon(new ImageIcon("src/ImagesBoutons/Mouton.jpg"));
				CA.remove(8);
				bool=0;
			}
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnPanthere"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class PanthereListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Pantheres dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPanthere.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(6, ValPanthere);
				 bool=1; 
			}
			else if(bool==1) {
				btnPanthere.setIcon(new ImageIcon("src/ImagesBoutons/Panthere.jpg"));
				CA.remove(6);
				bool=0;
			}
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnLoup
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class LoupListener implements ActionListener  {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Loups dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnLoup.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(12, ValLoup);
				 bool=1; 
			}
			else if(bool==1) {
				btnLoup.setIcon(new ImageIcon("src/ImagesBoutons/Loup.jpg"));
				CA.remove(12);
				bool=0;
			}
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnPanthereNeige"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class PanthereNeigeListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des PantheresNeiges dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPanthereNeige.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(10, ValPanthereNeige);
				 bool=1; 
			}
			else if(bool==1) {
				btnPanthereNeige.setIcon(new ImageIcon("src/ImagesBoutons/PanthereNeige.jpg"));
				CA.remove(10);
				bool=0;
			}
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnSerpent"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class SerpentListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Serpents dans la hasmap
		 * 
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnSerpent.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(9, ValSerpent);
				 bool=1; 
			}
			else if(bool==1) {
				btnSerpent.setIcon(new ImageIcon("src/ImagesBoutons/Serpent.jpg"));
				CA.remove(9);
				bool=0;
			}
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnTigre"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class TigreListener implements ActionListener {
		
		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Tigres dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnTigre.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(11, ValTigre);
				 bool=1; 
			}
			else if(bool==1) {
				btnTigre.setIcon(new ImageIcon("src/ImagesBoutons/Tigre.jpg"));
				CA.remove(11);
				bool=0;
			}
		}
		
	}
	
	/** Classe interne, ActionListener pour le bouton "btnOurs"
	 * permet de changer l'image du bouton lorsque l'on clique dessus
	 * 
	 * @author darco
	 *
	 */
	class OursListener implements ActionListener {

		int bool=0;
		@Override
		/**	Méthode permettant de changer l'image et de rentrer la valeur des Ours dans la hasmap
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnOurs.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 CA.put(1, ValOurs);
				 bool=1; 
			}
			else if(bool==1) {
				btnOurs.setIcon(new ImageIcon("src/ImagesBoutons/Ours.jpg"));
				CA.remove(1);
				bool=0;
			}
		}
	}
	
	/** Classe interne ActionListener pour le bouton "PlusLapin"
	 * permet d'incrémenter la valeur du nombre de lapins 
	 * @author darco
	 *
	 */
	class PlusLapinListener implements ActionListener {
		/**
		 * Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValLapin = ValLapin + 1;
			textLapin.setText(Integer.toString(ValLapin));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusLapin"
	 * permet de décrémenter la valeur du nombre de lapins 
	 * @author darco
	 *
	 */
	class MinusLapinListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValLapin = ValLapin - 1;
			textLapin.setText(Integer.toString(ValLapin));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusVache"
	 * permet d'incrémenter la valeur du nombre de Vaches 
	 * @author darco
	 *
	 */
	class PlusVacheListener implements ActionListener {
		/**
		 * Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValVache = ValVache + 1;
			textVache.setText(Integer.toString(ValVache));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusVache"
	 * permet de décrémenter la valeur du nombre de Vaches 
	 * @author darco
	 *
	 */
	class MinusVacheListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * 
		 */
		public void actionPerformed(ActionEvent e) {
			ValVache = ValVache - 1;
			textVache.setText(Integer.toString(ValVache));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusPanda"
	 * permet d'incrémenter la valeur du nombre de Pandas 
	 * @author darco
	 *
	 */
	class PlusPandaListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValPanda = ValPanda + 1;
			textPanda.setText(Integer.toString(ValPanda));
			
		}
	}
	/** Classe interne ActionListener pour le bouton "MinusPanda"
	 * permet de décrémenter la valeur du nombre de Pandas 
	 * @author darco
	 *
	 */
	
	class MinusPandaListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ValPanda = ValPanda - 1;
			textPanda.setText(Integer.toString(ValPanda));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusChevre"
	 * permet d'incrémenter la valeur du nombre de Chevres 
	 * @author darco
	 *
	 */
	class PlusChevreListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValChevre = ValChevre + 1;
			textChevre.setText(Integer.toString(ValChevre));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusChevre"
	 * permet de décrémenter la valeur du nombre de Chevres 
	 * @author darco
	 *
	 */
	class MinusChevreListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValChevre = ValChevre - 1;
			textChevre.setText(Integer.toString(ValChevre));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusPoule"
	 * permet d'incrémenter la valeur du nombre de Poules 
	 * @author darco
	 *
	 */
	class PlusPouleListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValPoule = ValPoule + 1;
			textPoule.setText(Integer.toString(ValPoule));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusPoule"
	 * permet de décrémenter la valeur du nombre de Poules 
	 * @author darco
	 *
	 */
	class MinusPouleListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValPoule = ValPoule - 1;
			textPoule.setText(Integer.toString(ValPoule));
		}
	}
	
	/** Classe interne ActionListener pour le bouton "PlusMouton"
	 * permet d'incrémenter la valeur du nombre de Moutons 
	 * @author darco
	 *
	 */
	class PlusMoutonListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValMouton = ValMouton + 1;
			textMouton.setText(Integer.toString(ValMouton));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusMouton"
	 * permet de décrémenter la valeur du nombre de Moutons 
	 * @author darco
	 *
	 */
	class MinusMoutonListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValMouton = ValMouton - 1;
			textMouton.setText(Integer.toString(ValMouton));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusPanthere"
	 * permet d'incrémenter la valeur du nombre de lapins 
	 * @author darco
	 *
	 */
	class PlusPanthereListener implements ActionListener {
		/**	Méthode permetant d'incrémenter
		 *@param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValPanthere = ValPanthere + 1;
			textPanthere.setText(Integer.toString(ValPanthere));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusPanthere"
	 * permet de décrémenter la valeur du nombre de Pantheres 
	 * @author darco
	 *
	 */
	class MinusPanthereListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValPanthere = ValPanthere - 1;
			textPanthere.setText(Integer.toString(ValPanthere));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusLoup"
	 * permet d'incrémenter la valeur du nombre de loups 
	 * @author darco
	 *
	 */
	class PlusLoupListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValLoup = ValLoup + 1;
			textLoup.setText(Integer.toString(ValLoup));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusLoup"
	 * permet de décrémenter la valeur du nombre de loups 
	 * @author darco
	 *
	 */
	class MinusLoupListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValLoup = ValLoup - 1;
			textLoup.setText(Integer.toString(ValLoup));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusPanthereNeige"
	 * permet d'incrémenter la valeur du nombre de PanthereNeiges 
	 * @author darco
	 *
	 */
	class PlusPanthereNeigeListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValPanthereNeige = ValPanthereNeige + 1;
			textPanthereNeige.setText(Integer.toString(ValPanthereNeige));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusPanthereNeige"
	 * permet de décrémenter la valeur du nombre de lapins 
	 * @author darco
	 *
	 */
	class MinusPanthereNeigeListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValPanthereNeige = ValPanthereNeige - 1;
			textPanthereNeige.setText(Integer.toString(ValPanthereNeige));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusSerpent"
	 * permet d'incrémenter la valeur du nombre de Serpents 
	 * @author darco
	 *
	 */
	class PlusSerpentListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 *	@param e 
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValSerpent = ValSerpent + 1;
			textSerpent.setText(Integer.toString(ValSerpent));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusSerpent"
	 * permet de décrémenter la valeur du nombre de Serpents
	 * s 
	 * @author darco
	 *
	 */
	class MinusSerpentListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValSerpent = ValSerpent - 1;
			textSerpent.setText(Integer.toString(ValSerpent));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusTigre"
	 * permet d'incrémenter la valeur du nombre de Tigres 
	 * @author darco
	 *
	 */
	class PlusTigreListener implements ActionListener {
		/**	Methode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValTigre = ValTigre + 1;
			textTigre.setText(Integer.toString(ValTigre));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusTigres"
	 * permet de décrémenter la valeur du nombre de Tigres 
	 * @author darco
	 *
	 */
	class MinusTigreListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValTigre = ValTigre - 1;
			textTigre.setText(Integer.toString(ValTigre));
		}
	}

	/** Classe interne ActionListener pour le bouton "PlusOurs"
	 * permet d'incrémenter la valeur du nombre de Ours 
	 * @author darco
	 *
	 */
	class PlusOursListener implements ActionListener {
		/**	Méthode permettant d'incrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			
			ValOurs = ValOurs + 1;
			textOurs.setText(Integer.toString(ValOurs));
			
		}
	}
	
	/** Classe interne ActionListener pour le bouton "MinusOurs"
	 * permet de décrémenter la valeur du nombre de Ours 
	 * @author darco
	 *
	 */
	class MinusOursListener implements ActionListener {
		/**	Méthode permettant de décrémenter
		 * @param e
		 */
		public void actionPerformed(ActionEvent e) {
			ValOurs = ValOurs - 1;
			textOurs.setText(Integer.toString(ValOurs));
		}
	}

}