package gui;

import javax.swing.JFrame;



public class Fenetre extends JFrame{
	
	public static JFrame getFen() {
		return fen;
	}
	public static Fenetre getInstance() {
		return instance;
	}
	private static JFrame fen = new JFrame();
	private Fenetre () {
		
	}
	private static Fenetre instance = new Fenetre();
}
