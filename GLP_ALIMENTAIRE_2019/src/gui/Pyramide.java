package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.Animals;
import data.DataHashmap;
import data.Herbivore;
import data.Primary1;
import process.management.CalculateChain;
import process.management.ManageHash;
/** Classe permettant de construire la pyramide ainsi que les compteur du mode GUI
 * 
 * @author darco
 *
 */
@SuppressWarnings("serial")
public class Pyramide extends JPanel implements Runnable{
	ManageHash mh = new ManageHash();
	
	/** les JLabel de la pyramide */
	
	private JLabel labelLapin = new JLabel("LAPIN");
	private JLabel labelVache = new JLabel("VACHE");
	private JLabel labelPanda = new JLabel("PANDA");
	private JLabel labelMouton = new JLabel("MOUTON");
	private JLabel labelChevre = new JLabel("CHEVRE");
	private JLabel labelPoule = new JLabel("POULE");
	private JLabel labelPanthere = new JLabel("PANTHERE");
	private JLabel labelLoup = new JLabel("LOUP");
	private JLabel labelPanthereNeige = new JLabel("PANTHERE NEIGE");
	private JLabel labelSerpent = new JLabel("SERPENT");
	private JLabel labelTigre = new JLabel("TIGRE");
	private JLabel labelOurs = new JLabel("OURS");
	private JLabel labelPlante = new JLabel ("PLANTES");
	
	/** Les compteur */
	
	private JButton CompteurLapin = new JButton("Lapins en vie : ");
	private JButton CompteurVache = new JButton("Vaches en vie : ");
	private JButton CompteurPanda = new JButton("Pandas en vie : ");
	private JButton CompteurMouton = new JButton("Moutons en vie : ");
	private JButton CompteurChevre = new JButton("Chevres en vie : ");
	private JButton CompteurPoule = new JButton("Poules en vie : ");
	private JButton CompteurPanthere = new JButton("Pantheres en vie : ");
	private JButton CompteurLoup = new JButton("Loups en vie : ");
	private JButton CompteurPanthereNeige = new JButton("Pantheres des neiges en vie : ");
	private JButton CompteurSerpent = new JButton("Serpents en vie : ");
	private JButton CompteurTigre = new JButton("Tigres en vie : ");
	private JButton CompteurOurs = new JButton("Ours en vie : ");
	
	/** titre de la pyramide */
	
	private JLabel titre = new JLabel("Chaîne Alimentaire");
	
	private int time=0;
	
	private JLabel temps = new JLabel("temps : "+time+" semaines");

	

	
	private Color c = new Color(192,192,192);

	private int x;
	private int y;

	   private BufferedImage image;
	   private BufferedImage image1;
	

	public Pyramide() {
		initPyramide();
		try {                
	          image = ImageIO.read(new File("src/image/arrow.png"));
	          image1 = ImageIO.read(new File("src/image/arrow2.png"));
	       } catch (IOException ex) {
	            
	       }
		 run();
		 
	}
	@Override
	 public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	       
	        g.drawImage(image,380 ,250 , 90,90, this);
	        g.drawImage(image, 380, 390, 90,90, this);
	        g.drawImage(image, 380, 540, 90,90, this);
	       /* g.setColor(color);
	        g.drawLine(15, 0, 15, 30);
	        g.drawLine(15, 30, 0, 30);
	        g.drawLine(0, 30, 23, 80);
	        g.drawLine(23, 80, 45, 30);
	        g.drawLine(45, 30, 30, 30);
	        g.drawLine(30, 30, 30, 0);
	        g.drawLine(30, 0, 15, 0);
	        
	        g.drawLine(15, 144, 15, 174);
	        g.drawLine(15, 174, 0, 174);
	        g.drawLine(0, 174,  23, 224);
	        g.drawLine(23, 224, 45, 174);
	        g.drawLine(45, 174, 30, 174);
	        g.drawLine(30, 174, 30, 144);
	        g.drawLine(30, 144, 15, 144);
	        
	        g.drawLine(15, 288, 15, 318);
	        g.drawLine(15, 318, 0, 318);
	        g.drawLine(0, 318, 23, 368);
	        g.drawLine(23, 368, 45, 318);
	        g.drawLine(45, 318, 30, 318);
	        g.drawLine(30, 318, 30, 288);
	        g.drawLine(30, 288, 15, 288);  */
	    }
	@Override
	public void run() {
		try {
			Thread.sleep(100);
			image=ImageIO.read(new File("src/image/arrow2.png"));
			this.repaint();
			Thread.sleep(100);
			image=ImageIO.read(new File("src/image/arrow.png"));
			this.repaint();
			Thread.sleep(100);
			
			
			
			this.update();
			
		}catch (Exception e) {
		}
	
		
	}
		
	
	public void update() {
		int x=32;
		Animals.getValue(DataHashmap.RABBIT).setNumber(Animals.getValue(DataHashmap.RABBIT).getNumber()+1);
		CompteurLapin.setText("Lapins en vie:" +Integer.toString(Animals.getValue(DataHashmap.RABBIT).getNumber()));
		CompteurVache.setText("Vaches en vie:" +Integer.toString(Animals.getValue(DataHashmap.COW).getNumber()));

	}
		
//	public void viewDead() {
//		if(mh.getDc().getNumber()==0) {
//		contenu=getContentPane();
//		panel=new BuildArrowBlack();
//		contenu.add(panel);
//		}else {
//			contenu=getContentPane();
//			panel=new BuildArrowRed();
//			contenu.add(panel);
//		}
//	}
	
	public void initPyramide() {
		
		
		this.setLayout(null);
		this.setBounds(1100, 0, 800, 1080);
		
		titre.setBounds(225, 0, 600, 200);
		titre.setFont(new Font("Arial Black", Font.PLAIN, 38));
		this.add(titre);
		
		temps.setBounds(355, 900, 300, 50);
		this.add(temps);
		
		CompteurLapin.setBounds(40, 705, 150, 50);
		CompteurLapin.setFont(new Font("Arial",Font.BOLD,10));
		CompteurLapin.addActionListener(new CompteurLapinListener());
		CompteurLapin.setText("Lapins en vie:" +Integer.toString(Animals.getValue(DataHashmap.RABBIT).getNumber()));
		this.add(CompteurLapin);
		
		CompteurVache.setBounds(40, 775, 150, 50);
		CompteurVache.setFont(new Font("Arial",Font.BOLD,10));
		CompteurVache.addActionListener(new CompteurVacheListener());
		CompteurVache.setText("Vaches en vie:" +Integer.toString(Animals.getValue(DataHashmap.COW).getNumber()));
		this.add(CompteurVache);
		
		CompteurPanda.setBounds(40,845,150,50);
		CompteurPanda.setFont(new Font("Arial",Font.BOLD,10));
		CompteurPanda.addActionListener(new CompteurPandaListener());
		CompteurPanda.setText("Pandas en vie:" +Integer.toString(Animals.getValue(DataHashmap.PANDA).getNumber()));
		this.add(CompteurPanda);

		
		CompteurChevre.setBounds(230, 705, 150, 50);
		CompteurChevre.setFont(new Font("Arial",Font.BOLD,10));
		CompteurChevre.addActionListener(new CompteurChevreListener());
		CompteurChevre.setText("Chevres en vie:" +Integer.toString(Animals.getValue(DataHashmap.GOAT).getNumber()));
		this.add(CompteurChevre);
		
		CompteurPoule.setBounds(230, 775, 150, 50);
		CompteurPoule.setFont(new Font("Arial",Font.BOLD,10));
		CompteurPoule.addActionListener(new CompteurPouleListener());
		CompteurPoule.setText("Poules en vie:" +Integer.toString(Animals.getValue(DataHashmap.CHICKEN).getNumber()));
		this.add(CompteurPoule);
		
		CompteurMouton.setBounds(230, 845, 150, 50);
		CompteurMouton.setFont(new Font("Arial",Font.BOLD,10));
		CompteurMouton.addActionListener(new CompteurMoutonListener());
		CompteurMouton.setText("Moutons en vie:" +Integer.toString(Animals.getValue(DataHashmap.SHEEP).getNumber()));
		this.add(CompteurMouton);
		
		CompteurPanthere.setBounds(420, 705, 150, 50);
		CompteurPanthere.setFont(new Font("Arial",Font.BOLD,10));
		CompteurPanthere.addActionListener(new CompteurPanthereListener());
		CompteurPanthere.setText("Pantheres en vie:" +Integer.toString(Animals.getValue(DataHashmap.PANTHER).getNumber()));
		this.add(CompteurPanthere);
		
		CompteurLoup.setBounds(420, 775, 150, 50);
		CompteurLoup.setFont(new Font("Arial",Font.BOLD,10));
		CompteurLoup.addActionListener(new CompteurLoupListener());
		
		this.add(CompteurLoup);
		
		CompteurPanthereNeige.setBounds(420, 845, 150, 50);
		CompteurPanthereNeige.setFont(new Font("Arial",Font.BOLD,10));
		CompteurPanthereNeige.addActionListener(new CompteurPanthereNeigeListener());
		CompteurPanthereNeige.setText("PanthereNeige en vie:" +Integer.toString(Animals.getValue(DataHashmap.SNOWLEOPARD).getNumber()));
		this.add(CompteurPanthereNeige);
		
		CompteurSerpent.setBounds(610, 705, 150, 50);
		CompteurSerpent.setFont(new Font("Arial",Font.BOLD,10));
		CompteurSerpent.addActionListener(new CompteurSerpentListener());
		CompteurSerpent.setText("Serpents en vie:" +Integer.toString(Animals.getValue(DataHashmap.SNAKE).getNumber()));
		this.add(CompteurSerpent);
		
		CompteurTigre.setBounds(610, 775, 150, 50);
		CompteurTigre.setFont(new Font("Arial",Font.BOLD,10));
		CompteurTigre.addActionListener(new CompteurTigreListener());
		CompteurTigre.setText("Tigres en vie:" +Integer.toString(Animals.getValue(DataHashmap.TIGER).getNumber()));
		this.add(CompteurTigre);
		
		CompteurOurs.setBounds(610, 845, 150, 50);
		CompteurOurs.setFont(new Font("Arial",Font.BOLD,10));
		CompteurOurs.addActionListener(new CompteurOursListener());
		CompteurOurs.setText("Ours en vie:" +Integer.toString(Animals.getValue(DataHashmap.BEAR).getNumber()));
		this.add(CompteurOurs);


		
		
		if(Herbivore.tailleArray()==2) {
			x=360;
		}else if(Herbivore.tailleArray()==3) {
			x=240;
		}else if(Herbivore.tailleArray()==4) {
			x=120;
		}else {
			x=70;
		}
			if(Animals.getHash().containsKey(DataHashmap.CHICKEN)) {
				labelPoule.setLayout(null);
				labelPoule.setBounds(x,482,120,54);
				labelPoule.setOpaque(true);
				labelPoule.setBackground(c);
				labelPoule.setHorizontalAlignment(JLabel.CENTER);
				labelPoule.setVerticalAlignment(JLabel.CENTER);
				labelPoule.setVisible(true);
				this.add(labelPoule);
				x=x+120;	
			}
			if(Animals.getHash().containsKey(DataHashmap.COW)) {
				
				labelVache.setBounds(x,482,120,54);
				labelVache.setOpaque(true);
				labelVache.setBackground(c);
				labelVache.setHorizontalAlignment(JLabel.CENTER);
				labelVache.setVerticalAlignment(JLabel.CENTER);
				this.add(labelVache);
				x=x+120;
			}
			if(Animals.getHash().containsKey(DataHashmap.GOAT)) {
				labelChevre.setBounds(x,482,120,54);
				labelChevre.setOpaque(true);
				labelChevre.setBackground(c);
				labelChevre.setHorizontalAlignment(JLabel.CENTER);
				labelChevre.setVerticalAlignment(JLabel.CENTER);
				this.add(labelChevre);
				x=x+120;
			}	
			if(Animals.getHash().containsKey(DataHashmap.PANDA)) {
				labelPanda.setBounds(x,482,120,54);
				labelPanda.setOpaque(true);
				labelPanda.setBackground(c);
				labelPanda.setHorizontalAlignment(JLabel.CENTER);
				labelPanda.setVerticalAlignment(JLabel.CENTER);
				this.add(labelPanda);
				x=x+120;
			}
			if(Animals.getHash().containsKey(DataHashmap.SHEEP)) {
				labelMouton.setBounds(x,482,120,54);
				labelMouton.setOpaque(true);
				labelMouton.setBackground(c);
				labelMouton.setHorizontalAlignment(JLabel.CENTER);
				labelMouton.setVerticalAlignment(JLabel.CENTER);
				this.add(labelMouton);
				x=x+120;
			}	
			if(Animals.getHash().containsKey(DataHashmap.RABBIT)) {
				labelLapin.setBounds(x,482,120,54);
				labelLapin.setOpaque(true);
				labelLapin.setBackground(c);
				labelLapin.setHorizontalAlignment(JLabel.CENTER);
				labelLapin.setVerticalAlignment(JLabel.CENTER);
				this.add(labelLapin);
				x=x+120;
			}	
			
			if(Primary1.tailleArray()==2) {
				y=360;
			}else if(Primary1.tailleArray()==3) {
				y=240;
			}else {
				y=180;
			}
		if(Animals.getHash().containsKey(DataHashmap.SNAKE)) {
			labelSerpent.setBounds(y, 338, 120, 54);
			labelSerpent.setOpaque(true);
			labelSerpent.setBackground(c);
			labelSerpent.setHorizontalAlignment(JLabel.CENTER);
			labelSerpent.setVerticalAlignment(JLabel.CENTER);
			this.add(labelSerpent);
			y=y+120;
		}
		if(Animals.getHash().containsKey(DataHashmap.PANTHER)) {
			labelPanthere.setBounds(y, 338, 120, 54);
			labelPanthere.setOpaque(true);
			labelPanthere.setBackground(c);
			labelPanthere.setHorizontalAlignment(JLabel.CENTER);
			labelPanthere.setVerticalAlignment(JLabel.CENTER);
			this.add(labelPanthere);
			y=y+120;
		}
		if(Animals.getHash().containsKey(DataHashmap.WOLF)) {
			labelLoup.setBounds(y, 338, 120, 54);
			labelLoup.setOpaque(true);
			labelLoup.setBackground(c);
			labelLoup.setHorizontalAlignment(JLabel.CENTER);
			labelLoup.setVerticalAlignment(JLabel.CENTER);
			this.add(labelLoup);
			y=y+120;
		}
		if(Animals.getHash().containsKey(DataHashmap.SNOWLEOPARD)) {
			labelPanthereNeige.setBounds(y, 338, 140, 54);
			labelPanthereNeige.setOpaque(true);
			labelPanthereNeige.setBackground(c);
			labelPanthereNeige.setHorizontalAlignment(JLabel.CENTER);
			labelPanthereNeige.setVerticalAlignment(JLabel.CENTER);
			this.add(labelPanthereNeige);
		}
		labelTigre.setBounds(280, 194, 140, 54);
		labelTigre.setOpaque(true);
		labelTigre.setBackground(c);
		labelTigre.setHorizontalAlignment(JLabel.CENTER);
		labelTigre.setVerticalAlignment(JLabel.CENTER);
		this.add(labelTigre);
		
		labelOurs.setBounds(420, 194, 140, 54);
		labelOurs.setOpaque(true);
		labelOurs.setBackground(c);
		labelOurs.setHorizontalAlignment(JLabel.CENTER);
		labelOurs.setVerticalAlignment(JLabel.CENTER);
		this.add(labelOurs);
		
		labelPlante.setBounds(0, 626, 840, 54);
		labelPlante.setOpaque(true);
		labelPlante.setBackground(c);
		labelPlante.setHorizontalAlignment(JLabel.CENTER);
		labelPlante.setVerticalAlignment(JLabel.CENTER);
		this.add(labelPlante);
		
		Fenetre.getInstance().getContentPane().add(this);
		

	}
	
	class CompteurLapinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FicheLapin fl = new FicheLapin();
		}
		
	}
	
	class CompteurVacheListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FicheVache fv = new FicheVache();
			}
			
		
	}
	
	class CompteurPandaListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FichePanda fp = new FichePanda();
		}
	
	}
	
	class CompteurChevreListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FicheChevre fc = new FicheChevre();
		}
	}
	
	class CompteurPouleListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FichePoule fp = new FichePoule();
		}
	}
	
	class CompteurMoutonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FicheMouton fm = new FicheMouton();
		}
	}
	
	class CompteurPanthereListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FichePanthere fp = new FichePanthere();
		}
	}
	
	class CompteurLoupListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FicheLoup fl = new FicheLoup();
		}
	}
	
	class CompteurPanthereNeigeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FichePanthereNeige fp = new FichePanthereNeige();
		}
	}
	
	class CompteurSerpentListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FicheSerpent fs = new FicheSerpent();
		}
	}
	
	class CompteurTigreListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FicheTigre ft = new FicheTigre();
		}
	}
	
	class CompteurOursListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FicheOurs fo = new FicheOurs();
		}
	}
}