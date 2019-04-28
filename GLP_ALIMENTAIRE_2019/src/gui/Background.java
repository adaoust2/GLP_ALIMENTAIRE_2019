package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import data.DataHashmap;
import process.management.ManageHash;

public class Background {
	ImagePanel ip = new ImagePanel();
	public void init() {
		ip.setBounds(50, 50, 900, 900);
		ip.setLayout(null);
		Fenetre.getInstance().getContentPane().add(ip);
		Fenetre.getInstance().setSize(1920, 1080);
		Fenetre.getInstance().setLayout(null);
	    Fenetre.getInstance().setVisible(true);
		Fenetre.getInstance().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void run() {
		init();
		ManageHash mh = new ManageHash();
		
		
		mh.manageAni(DataHashmap.BEAR);
		mh.manageAni(DataHashmap.CHICKEN);
		mh.manageAni(DataHashmap.COW);
		mh.manageAni(DataHashmap.GOAT);
		mh.manageAni(DataHashmap.PANTHER);
		mh.manageAni(DataHashmap.RABBIT);
		mh.manageAni(DataHashmap.SHEEP);
		mh.manageAni(DataHashmap.SNAKE);
		mh.manageAni(DataHashmap.SNOWLEOPARD);
		mh.manageAni(DataHashmap.TIGER);
	//	mh.manageAni(DataHashmap.WOLF);
		mh.manageAni(DataHashmap.PANDA);
		EcosystemGui eg = new EcosystemGui();

		GuiAnimals ga = new GuiAnimals();
		ip.add(ga.drawAnimals(DataHashmap.BEAR));
		ip.add(ga.drawAnimals(DataHashmap.CHICKEN));
	//	ip.add(ga.drawAnimals(DataHashmap.WOLF));
		ip.add(ga.drawAnimals(DataHashmap.SNAKE));
		ip.add(ga.drawAnimals(DataHashmap.COW));
		ip.add(ga.drawAnimals(DataHashmap.SHEEP));
		ip.add(ga.drawAnimals(DataHashmap.GOAT));
		ip.add(ga.drawAnimals(DataHashmap.PANTHER));
		ip.add(ga.drawAnimals(DataHashmap.TIGER));
		ip.add(ga.drawAnimals(DataHashmap.SNOWLEOPARD));
		ip.add(ga.drawAnimals(DataHashmap.RABBIT));
		ip.add(ga.drawAnimals(DataHashmap.PANDA));
		
		
		eg.run();		
	}
}
