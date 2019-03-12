import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SpinnerNumberModel;


public class Menu extends JFrame{
	
	private JPanel panel = new JPanel();
	
	private JOptionPane test = new JOptionPane();
	
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
	
	private JButton btnNext = new JButton("Next");
	private JButton btnReset = new JButton("Reset");
	
	JLabel titre = new JLabel("Choisissez vos espèces (Maximum:100)");
	
	private JSpinner spinLapin = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinVache = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinPanda = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinChevre = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinPoule = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinMouton = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinPanthere = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinLoup = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinPanthereNeige = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinSerpent = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinTigre = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	private JSpinner spinOurs = new JSpinner(new SpinnerNumberModel(0,0,100,1));
	
	private int valLapin;
	private int valVache;
	private int valPanda;
	private int valChevre;
	private int valPoule;
	private int valMouton;
	private int valPanthere;
	private int valLoup;
	private int valPanthereNeige;
	private int valSerpent;
	private int valTigre;
	private int valOurs;
	
	public static final int BEAR = 1;
	public static final int CHICKEN = 2;
	public static final int COW = 3;
	public static final int GOAT = 4;
	public static final int PANDA = 5;
	public static final int PANTHER = 6;
	public static final int RABBIT = 7;	
	public static final int SHEEP = 8;
	public static final int SNAKE = 9;	
	public static final int SNOWLEOPARD = 10;
	public static final int TIGER = 11;	
	public static final int WOLF = 12;
	
	private ArrayList a = new ArrayList();
	

	public static void main (String [] args) {
		
		Menu menu = new Menu();
		
		
	}
	
	
	
	public Menu() {
		
		this.setTitle("Menu Principal");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		
		
		
		titre.setBounds(485, 30, 1150, 40);
		titre.setFont(new Font("Arial Black", Font.PLAIN, 38));
		panel.add(titre);
		
		
		btnLapin.setBounds(40, 145, 430, 160);
		btnLapin.addActionListener(new LapinListener());
		panel.add(btnLapin);
		
		btnVache.addActionListener(new VacheListener());
		panel.add(btnVache);
		btnVache.setBounds(40, 385, 430, 160);
		
		btnPanda.addActionListener(new PandaListener());
		panel.add(btnPanda);
		btnPanda.setBounds(40, 625, 430, 160);
		
		btnChevre.addActionListener(new ChevreListener());
		panel.add(btnChevre);
		btnChevre.setBounds(510, 145, 430, 160);
		
		btnPoule.addActionListener(new PouleListener());
		panel.add(btnPoule);
		btnPoule.setBounds(510, 385, 430, 160);
		
		btnMouton.addActionListener(new MoutonListener());
		panel.add(btnMouton);
		btnMouton.setBounds(510, 625, 430, 160);
		
		btnPanthere.addActionListener(new PanthereListener());
		panel.add(btnPanthere);
		btnPanthere.setBounds(980, 145, 430, 160);
		
		btnLoup.addActionListener(new LoupListener());
		panel.add(btnLoup);
		btnLoup.setBounds(980, 385, 430, 160);
		
		btnPanthereNeige.addActionListener(new PanthereNeigeListener());
		panel.add(btnPanthereNeige);
		btnPanthereNeige.setBounds(980, 625, 430, 160);
		
		btnSerpent.addActionListener(new SerpentListener());
		panel.add(btnSerpent);
		btnSerpent.setBounds(1450,145 , 430, 160);
		
		btnTigre.addActionListener(new TigreListener());
		panel.add(btnTigre);
		btnTigre.setBounds(1450, 385, 430, 160);
		
		btnOurs.addActionListener(new OursListener());
		btnOurs.setBounds(1450, 625, 430, 160);
		panel.add(btnOurs);
		
		btnNext.setBounds(760,880 , 200, 100);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (condition()) {
				
				valLapin = spinLapin.getComponentCount();
				valVache = spinVache.getComponentCount();
				valPanda = spinPanda.getComponentCount();
				valChevre = spinChevre.getComponentCount();
				valPoule = spinPoule.getComponentCount();
				valMouton = spinMouton.getComponentCount();
				valPanthere = spinPanthere.getComponentCount();
				valLoup = spinLoup.getComponentCount();
				valPanthereNeige = spinPanthereNeige.getComponentCount();
				valSerpent = spinSerpent.getComponentCount();
				valTigre = spinTigre.getComponentCount();
				valOurs = spinOurs.getComponentCount();
				
				AjoutArrayList();
					
				try {
					Map map = new Map();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				}
			
				else {
					
					test.showMessageDialog(panel, "ERREUR, veuillez respecter les conditions"," ErrorMessage", JOptionPane.ERROR_MESSAGE);	
				}
				
			}
		});
		
		panel.add(btnNext);
		
		
		btnReset.setBounds(960, 880, 200, 100);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				spinLapin.setValue(0);
				spinVache.setValue(0);
				spinPanda.setValue(0);
				spinChevre.setValue(0);
				spinPoule.setValue(0);
				spinMouton.setValue(0);
				spinPanthere.setValue(0);
				spinLoup.setValue(0);
				spinPanthereNeige.setValue(0);
				spinSerpent.setValue(0);
				spinTigre.setValue(0);
				spinOurs.setValue(0);
			}
		});
		
		panel.add(btnReset);
		
		
		
		
		
		spinLapin.setEditor(new DefaultEditor(spinLapin)); 
		spinLapin.setBounds(40, 305, 430,50 );
		panel.add(spinLapin);
		
		spinVache.setEditor(new DefaultEditor(spinVache)); 
		spinVache.setBounds(40, 545, 430,50 );
		panel.add(spinVache);
		
		spinPanda.setEditor(new DefaultEditor(spinPanda)); 
		spinPanda.setBounds(40, 785, 430,50 );
		panel.add(spinPanda);
		
		spinPoule.setEditor(new DefaultEditor(spinPoule)); 
		spinPoule.setBounds(510, 545, 430,50 );
		panel.add(spinPoule);
		
		spinChevre.setEditor(new DefaultEditor(spinChevre)); 
		spinChevre.setBounds(510, 305, 430,50 );
		panel.add(spinChevre);
		
		spinMouton.setEditor(new DefaultEditor(spinMouton)); 
		spinMouton.setBounds(510, 785, 430,50 );
		panel.add(spinMouton);
		
		spinPanthere.setEditor(new DefaultEditor(spinPanthere)); 
		spinPanthere.setBounds(980, 305, 430,50 );
		panel.add(spinPanthere);
		
		spinLoup.setEditor(new DefaultEditor(spinLoup)); 
		spinLoup.setBounds(980, 545, 430,50 );
		panel.add(spinLoup);
		
		spinPanthereNeige.setEditor(new DefaultEditor(spinPanthereNeige)); 
		spinPanthereNeige.setBounds(980, 785, 430,50 );
		panel.add(spinPanthereNeige);
		
		spinSerpent.setEditor(new DefaultEditor(spinSerpent)); 
		spinSerpent.setBounds(1450, 305, 430,50 );
		panel.add(spinSerpent);
		
		spinTigre.setEditor(new DefaultEditor(spinTigre)); 
		spinTigre.setBounds(1450, 545, 430,50 );
		panel.add(spinTigre);
		
		spinOurs.setEditor(new DefaultEditor(spinOurs)); 
		spinOurs.setBounds(1450, 785, 430,50 );
		panel.add(spinOurs);
		
		
		
		
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
	
	public void AjoutArrayList() {
		
		if(valLapin > 0) {
			a.add(RABBIT);
		}
		if(valVache > 0) {
			a.add(COW);
		}
		if(valPanda > 0) {
			a.add(PANDA);
		}
		if(valChevre > 0) {
			a.add(GOAT);
		}
		if(valPoule > 0) {
			a.add(CHICKEN);
		}
		if(valMouton > 0) {
			a.add(SHEEP);
		}
		if(valPanthere > 0) {
			a.add(PANTHER);
		}
		if(valLoup > 0) {
			a.add(WOLF);
		}
		if(valPanthereNeige > 0) {
			a.add(SNOWLEOPARD);
		}
		if(valSerpent > 0) {
			a.add(SNAKE);
		}
		if(valTigre > 0) {
			a.add(TIGER);
		}
		if(valOurs > 0) {
			a.add(BEAR);
		}
		
	}
	
	public boolean condition() {
		return true;
		}
		
	
	
	class LapinListener implements ActionListener{ 
		int bool=0;
		@Override 
		public void actionPerformed(ActionEvent arg0) {
		
		if(bool==0){
			 btnLapin.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
			 bool=1; 
		}
		else if(bool==1) {
			btnLapin.setIcon(new ImageIcon("src/ImagesBoutons/Lapin.jpg"));
			bool=0;
		}
		
	}
	}
		
	class VacheListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(bool==0){
				 btnVache.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnVache.setIcon(new ImageIcon("src/ImagesBoutons/Vache.jpg"));
				bool=0;
			}
			
		}
		
	}
	
	
	class PandaListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPanda.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnPanda.setIcon(new ImageIcon("src/ImagesBoutons/Panda.jpg"));
				bool=0;
			}
		}
		
	}
		
	class ChevreListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(bool==0){
				 btnChevre.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnChevre.setIcon(new ImageIcon("src/ImagesBoutons/Chevre.jpg"));
				bool=0;
			}
		}
		
	}

	class PouleListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPoule.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnPoule.setIcon(new ImageIcon("src/ImagesBoutons/Poule.jpg"));
				bool=0;
			}
		}
		
	}
	
	class MoutonListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnMouton.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnMouton.setIcon(new ImageIcon("src/ImagesBoutons/Mouton.jpg"));
				bool=0;
			}
		}
		
	}
	
	class PanthereListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPanthere.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnPanthere.setIcon(new ImageIcon("src/ImagesBoutons/Panthere.jpg"));
				bool=0;
			}
		}
		
	}
	
	
	class LoupListener implements ActionListener  {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnLoup.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnLoup.setIcon(new ImageIcon("src/ImagesBoutons/Loup.jpg"));
				bool=0;
			}
		}
		
	}
	
	class PanthereNeigeListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnPanthereNeige.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnPanthereNeige.setIcon(new ImageIcon("src/ImagesBoutons/PanthereNeige.jpg"));
				bool=0;
			}
		}
		
	}
	
	class SerpentListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnSerpent.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnSerpent.setIcon(new ImageIcon("src/ImagesBoutons/Serpent.jpg"));
				bool=0;
			}
		}
		
	}
	
	class TigreListener implements ActionListener {
		
		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnTigre.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnTigre.setIcon(new ImageIcon("src/ImagesBoutons/Tigre.jpg"));
				bool=0;
			}
		}
		
	}
	
	
	class OursListener implements ActionListener {

		int bool=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(bool==0){
				 btnOurs.setIcon(new ImageIcon("src/ImagesBoutons/valide.jpg"));
				 bool=1; 
			}
			else if(bool==1) {
				btnOurs.setIcon(new ImageIcon("src/ImagesBoutons/Ours.jpg"));
				bool=0;
			}
		}
		
	}
	
	}
	
	