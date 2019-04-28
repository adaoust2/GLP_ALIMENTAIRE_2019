package gui;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JMenuBar;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.JSplitPane;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Principal {

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
    private JPanel panel;
    private JButton btnNewButton;
    

    public Principal() {
        initialize();
    }

    
    
    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JButton btnPause = new JButton("Pause");
        btnPause.setBounds(1566, 900, 414, 53);
        frame.getContentPane().add(btnPause);
        
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(0, 900, 255, 64);
        
        frame.getContentPane().add(btnExit);
        
        Component horizontalStrut = Box.createHorizontalStrut(20);
        horizontalStrut.setBounds(84, 216, 262, 1);
        frame.getContentPane().add(horizontalStrut);
        
        Component horizontalGlue = Box.createHorizontalGlue();
        horizontalGlue.setBounds(94, 228, 240, -11);
        frame.getContentPane().add(horizontalGlue);
        
        txtCompteur_1 = new JTextField();
        txtCompteur_1.setText("Lapin : 10");
        txtCompteur_1.setBounds(0, 0, 205, 74);
        frame.getContentPane().add(txtCompteur_1);
        txtCompteur_1.setFocusable(false);
        txtCompteur_1.setColumns(10);
        
        txtCompteur_2 = new JTextField();
        txtCompteur_2.setText("Ours : 2");
        txtCompteur_2.setColumns(10);
        txtCompteur_2.setBounds(0, 154, 205, 74);
        txtCompteur_2.setFocusable(false);
        frame.getContentPane().add(txtCompteur_2);
        
        txtCompteur = new JTextField();
        txtCompteur.setText("Compteur 3");
        txtCompteur.setColumns(10);
        txtCompteur.setFocusable(false);
        txtCompteur.setBounds(0, 308, 205, 74);
        frame.getContentPane().add(txtCompteur);
        
        txtCompteur_3 = new JTextField();
        txtCompteur_3.setText("Compteur 4");
        txtCompteur_3.setColumns(10);
        txtCompteur_3.setBounds(0, 462, 205, 74);
        txtCompteur_3.setFocusable(false);
        frame.getContentPane().add(txtCompteur_3);
        
        txtCompteur_4 = new JTextField();
        txtCompteur_4.setText("Compteur 5");
        txtCompteur_4.setColumns(10);
        txtCompteur_4.setBounds(0, 620, 205, 74);
        txtCompteur_4.setFocusable(false);
        frame.getContentPane().add(txtCompteur_4);
        
        btnLapin = new JButton("Lapin");
        btnLapin.setBounds(1720, 0, 180, 70);
        frame.getContentPane().add(btnLapin);
        
        btnChevre = new JButton("Chevre");
        btnChevre.setBounds(1720, 150, 180, 70);
        frame.getContentPane().add(btnChevre);
        
        btnSerpent = new JButton("Serpent");
        btnSerpent.setBounds(1720, 300, 180, 70);
        frame.getContentPane().add(btnSerpent);
        
        btnLoup = new JButton("Loup");
        btnLoup.setBounds(1720, 450, 180, 70);
        frame.getContentPane().add(btnLoup);
        
        btnOurs = new JButton("Ours");
        btnOurs.setBounds(1720, 600, 180, 70);
        frame.getContentPane().add(btnOurs);
        
        txtSemaine = new JTextField();
        txtSemaine.setText("Semaine 1");
        txtSemaine.setEditable(false);
        txtSemaine.setBounds(815, 900, 350, 64);
        frame.getContentPane().add(txtSemaine);
        txtSemaine.setColumns(10);
        
        
        panel = new JPanel();

        JPanel panel2 = new JPanel();
        Color myColor = Color.decode("#33CC00");
        Color myColor2 = Color.decode("#FFCC66");
        panel.setBounds(400, 50, 549, 763);
        panel2.setBounds(949, 50, 549, 763);
        panel.setBackground(myColor);
        panel2.setBackground(myColor2);
        
        /*BufferedImage myPicture = ImageIO.read(new File("/home/etu/fnini/eclipse-workspace/Alimentaire/src/Ours.png"));
        Graphics2D g = (Graphics2D) myPicture.getGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);;
        g.drawImage(myPicture,0,0,100,100,null);
        g.dispose();*/
    
        
        
        ImageIcon icon = new ImageIcon("C:\\Users\\darco\\eclipse-workspace\\Projet GLP\\src\\ImagesAnimauxMap\\Ours.png");
        JLabel img = new JLabel(icon);
        

       
        panel2.add(img);
        ImageIcon icon1 = new ImageIcon("C:\\Users\\darco\\eclipse-workspace\\Projet GLP\\src\\ImagesAnimauxMap\\Lapin.png");
        JLabel img1 = new JLabel(icon1);
        panel.add(img1);
        img1.setBounds(150, 450,100 , 250);


        
        
        
        frame.getContentPane().add(panel2);
        frame.getContentPane().add(panel);
        
        
        frame.setVisible(true);
        //frame.setContentPane(panel);
        
        
        
        
    }
                

        }