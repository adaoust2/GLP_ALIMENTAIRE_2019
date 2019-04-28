package gui;

import javax.swing.*;

import data.Animals;
import data.DataHashmap;
import data.Herbivore;
import data.Primary1;
import process.management.Climat;
@SuppressWarnings("serial")
public class GuiAnimals {
	private boolean stop = true;
	public GuiAnimals() {}
	private int x,y ;
	private static JLabel bear;
	private static JLabel chicken;
	private static JLabel cow;
	private static JLabel goat;
	private static JLabel panda;
	private static JLabel panther;
	private static JLabel sheep;
	private static JLabel snake;
	private static JLabel snowleopard;
	private static JLabel tiger;
	private static JLabel wolf;
	private static JLabel rabbit;
	
    public static JLabel getBear() {
		return bear;
	}
	public static JLabel getChicken() {
		return chicken;
	}
	public static JLabel getCow() {
		return cow;
	}
	public static JLabel getGoat() {
		return goat;
	}
	public static JLabel getPanda() {
		return panda;
	}
	public static JLabel getPanther() {
		return panther;
	}
	public static JLabel getSheep() {
		return sheep;
	}
	public static JLabel getSnake() {
		return snake;
	}
	public static JLabel getSnowleopard() {
		return snowleopard;
	}
	public static JLabel getTiger() {
		return tiger;
	}
	public static JLabel getWolf() {
		return wolf;
	}
	public static JLabel getRabbit() {
		return rabbit;
	}
	public int randomPositionX () {
    	x= (int) (Math.random()*800); 	
    	return x;
    }
    public int randomPositionY () {
    	y= (int) (Math.random()*825); 
    	return y;
    }
	Climat cl = new Climat();
    public JLabel drawAnimals (int n) {
    	if(n==DataHashmap.BEAR) {
    		bear = new JLabel(new ImageIcon("src/image/bear.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		bear.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.BEAR).setX(x);
    		Animals.getValue(DataHashmap.BEAR).setY(y);
    		cl.setclimat(DataHashmap.BEAR,x,y);
    		bear.setVisible(true);
    		return bear ;
    	}else if (n==DataHashmap.CHICKEN) {
    		chicken = new JLabel(new ImageIcon("src/image/chicken.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		chicken.setBounds(x,y,75,75);
    		Animals.getValue(DataHashmap.CHICKEN).setX(x);
    		Animals.getValue(DataHashmap.CHICKEN).setY(y);
    		cl.setclimat(DataHashmap.CHICKEN,x,y);
    		chicken.setVisible(true);
    		return chicken ;
    	}else if (n==DataHashmap.COW) {
    		cow = new JLabel(new ImageIcon("src/image/cow.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		cow.setBounds(x, y, 75, 75);
    		Animals.getValue(DataHashmap.COW).setX(x);
    		Animals.getValue(DataHashmap.COW).setY(y);
    		cl.setclimat(DataHashmap.COW,x,y);
    		cow.setVisible(true);
    		return cow ;
    	}else if (n==DataHashmap.GOAT) {
    		goat = new JLabel(new ImageIcon("src/image/goat.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		goat.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.GOAT).setX(x);
    		Animals.getValue(DataHashmap.GOAT).setY(y);
    		goat.setVisible(true);
    		return goat ;
    	}else if (n==DataHashmap.PANDA) {
    		panda = new JLabel(new ImageIcon("src/image/panda.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		panda.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.PANDA).setX(x);
    		Animals.getValue(DataHashmap.PANDA).setY(y);
    		cl.setclimat(DataHashmap.PANDA,x,y);
    		panda.setVisible(true);
    		return panda ;
    	}else if (n==DataHashmap.PANTHER) {
    		panther = new JLabel(new ImageIcon("src/image/panther.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		panther.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.PANTHER).setX(x);
    		Animals.getValue(DataHashmap.PANTHER).setY(y);
    		cl.setclimat(DataHashmap.PANTHER,x,y);
    		panther.setVisible(true);
    		return panther ;
    	}else if (n==DataHashmap.RABBIT) {
    		rabbit = new JLabel(new ImageIcon("src/image/rabbit.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		rabbit.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.RABBIT).setX(x);
    		Animals.getValue(DataHashmap.RABBIT).setY(y);
    		cl.setclimat(DataHashmap.RABBIT,x,y);
    		rabbit.setVisible(true);
    		return rabbit ;
    	}else if (n==DataHashmap.SHEEP) {
    		sheep = new JLabel(new ImageIcon("src/image/sheep.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		sheep.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.SHEEP).setX(x);
    		Animals.getValue(DataHashmap.SHEEP).setY(y);
    		cl.setclimat(DataHashmap.SHEEP,x,y);
    		sheep.setVisible(true);
    		return sheep ;
    	}else if (n==DataHashmap.SNAKE) {
    		snake = new JLabel(new ImageIcon("src/image/snake.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		snake.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.SNAKE).setX(x);
    		Animals.getValue(DataHashmap.SNAKE).setY(y);
    		cl.setclimat(DataHashmap.SNAKE,x,y);
    		snake.setVisible(true);
    		return snake ;
    	}else if (n==DataHashmap.SNOWLEOPARD) {
    		snowleopard = new JLabel(new ImageIcon("src/image/snowleopard.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		snowleopard.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.SNOWLEOPARD).setX(x);
    		Animals.getValue(DataHashmap.SNOWLEOPARD).setY(y);
    		cl.setclimat(DataHashmap.SNOWLEOPARD,x,y);
    		snowleopard.setVisible(true);
    		return snowleopard ;
    	}else if (n==DataHashmap.TIGER) {
    		tiger = new JLabel(new ImageIcon("src/image/tiger.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		tiger.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.TIGER).setX(x);
    		Animals.getValue(DataHashmap.TIGER).setY(y);
    		cl.setclimat(DataHashmap.TIGER,x,y);
    		tiger.setVisible(true);
    		return tiger ;
    	}else {
    		wolf = new JLabel(new ImageIcon("src/image/wolf.png"));
    		randomPositionX();
    		randomPositionY();
    		if(y>=380 && y<=495) {
    			randomPositionY();
    		}
    		wolf.setBounds(x,y, 75, 75);
    		Animals.getValue(DataHashmap.WOLF).setX(x);
    		Animals.getValue(DataHashmap.WOLF).setY(y);
    		cl.setclimat(DataHashmap.WOLF,x,y);
    		wolf.setVisible(true);
    		return wolf ; 
    	}		
    }
}