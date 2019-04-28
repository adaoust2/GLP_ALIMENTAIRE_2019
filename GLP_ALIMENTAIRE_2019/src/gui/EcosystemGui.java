package gui;

import java.awt.Color;

import javax.swing.JFrame;

import data.Animals;
import data.DataHashmap;
import data.Herbivore;
import data.Primary1;
import process.management.Movement;

public class EcosystemGui extends JFrame implements Runnable{
	
	GuiAnimals ga = new GuiAnimals();
	Movement mo = new Movement();
	Pyramide pyr = new Pyramide();
	BuildArrowBlack bb = new BuildArrowBlack();
	private boolean stop = true;

	public void migration(int n) {
		if(DataHashmap.BEAR==n) {
			if(Animals.getValue(DataHashmap.BEAR).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.BEAR).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getBear().setBounds(Animals.getValue(DataHashmap.BEAR).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.BEAR).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.BEAR).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getBear().setBounds(Animals.getValue(DataHashmap.BEAR).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.CHICKEN==n) {
			if(Animals.getValue(DataHashmap.CHICKEN).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.CHICKEN).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getChicken().setBounds(Animals.getValue(DataHashmap.CHICKEN).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.CHICKEN).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.CHICKEN).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getChicken().setBounds(Animals.getValue(DataHashmap.CHICKEN).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.COW==n) {
			if(Animals.getValue(DataHashmap.COW).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.COW).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getCow().setBounds(Animals.getValue(DataHashmap.CHICKEN).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.COW).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.COW).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getCow().setBounds(Animals.getValue(DataHashmap.COW).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.GOAT==n) {
			if(Animals.getValue(DataHashmap.GOAT).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.GOAT).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getGoat().setBounds(Animals.getValue(DataHashmap.CHICKEN).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.GOAT).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.GOAT).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getGoat().setBounds(Animals.getValue(DataHashmap.GOAT).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.PANDA==n) {
			if(Animals.getValue(DataHashmap.PANDA).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.PANDA).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getPanda().setBounds(Animals.getValue(DataHashmap.CHICKEN).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.PANDA).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.PANDA).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getPanda().setBounds(Animals.getValue(DataHashmap.PANDA).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.PANTHER==n) {
			if(Animals.getValue(DataHashmap.PANTHER).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.PANTHER).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getPanther().setBounds(Animals.getValue(DataHashmap.PANTHER).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.PANTHER).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.PANTHER).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getPanther().setBounds(Animals.getValue(DataHashmap.PANTHER).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.RABBIT==n) {
			if(Animals.getValue(DataHashmap.RABBIT).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.RABBIT).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getRabbit().setBounds(Animals.getValue(DataHashmap.CHICKEN).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.RABBIT).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.RABBIT).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getRabbit().setBounds(Animals.getValue(DataHashmap.RABBIT).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.SHEEP==n) {
			if(Animals.getValue(DataHashmap.SHEEP).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.SHEEP).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getSheep().setBounds(Animals.getValue(DataHashmap.SHEEP).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.SHEEP).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.SHEEP).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getSheep().setBounds(Animals.getValue(DataHashmap.SHEEP).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.SNAKE==n) {
			if(Animals.getValue(DataHashmap.SNAKE).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.SNAKE).setY(DataHashmap.SOUTH_MIGRATION+1);
				GuiAnimals.getSnake().setBounds(Animals.getValue(DataHashmap.SNAKE).getX(), DataHashmap.SOUTH_MIGRATION+1, 75, 75);
			}
			if(Animals.getValue(DataHashmap.SNAKE).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.SNAKE).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getSnake().setBounds(Animals.getValue(DataHashmap.SNAKE).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.SNOWLEOPARD==n) {
			if(Animals.getValue(DataHashmap.SNOWLEOPARD).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.SNOWLEOPARD).setY(DataHashmap.SOUTH_MIGRATION+1);
				GuiAnimals.getSnowleopard().setBounds(Animals.getValue(DataHashmap.SNOWLEOPARD).getX(), DataHashmap.SOUTH_MIGRATION+1, 75, 75);
			}
			if(Animals.getValue(DataHashmap.SNOWLEOPARD).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.SNOWLEOPARD).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getSnowleopard().setBounds(Animals.getValue(DataHashmap.SNOWLEOPARD).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.TIGER==n) {
			if(Animals.getValue(DataHashmap.TIGER).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.TIGER).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getTiger().setBounds(Animals.getValue(DataHashmap.TIGER).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.TIGER).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.TIGER).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getTiger().setBounds(Animals.getValue(DataHashmap.TIGER).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
		if(DataHashmap.WOLF==n) {
			if(Animals.getValue(DataHashmap.WOLF).getY()==DataHashmap.NORTH_MIGRATION) {
				Animals.getValue(DataHashmap.WOLF).setY(DataHashmap.SOUTH_MIGRATION);
				GuiAnimals.getWolf().setBounds(Animals.getValue(DataHashmap.WOLF).getX(), DataHashmap.SOUTH_MIGRATION, 75, 75);
			}
			if(Animals.getValue(DataHashmap.WOLF).getY()==DataHashmap.SOUTH_MIGRATION) {
				Animals.getValue(DataHashmap.WOLF).setY(DataHashmap.NORTH_MIGRATION);
				GuiAnimals.getWolf().setBounds(Animals.getValue(DataHashmap.WOLF).getX(), DataHashmap.NORTH_MIGRATION, 75, 75);
			}
		}
	}
    public void updatesValues() {
    	if(Herbivore.getHerb().contains(DataHashmap.CHICKEN)) {
    			mo.directionX(DataHashmap.CHICKEN);
    			migration(DataHashmap.CHICKEN);
    			mo.directionY(DataHashmap.CHICKEN);
    		
    	}
    	if(Animals.getHash().containsKey(DataHashmap.BEAR)) {
    			mo.directionX(DataHashmap.BEAR);
    			migration(DataHashmap.BEAR);
        		mo.directionY(DataHashmap.BEAR);
        	
    		
    	}
    	if(Herbivore.getHerb().contains(DataHashmap.COW)) {
    		mo.directionX(DataHashmap.COW);
			migration(DataHashmap.COW);
    		mo.directionY(DataHashmap.COW);
    	}
    	if(Herbivore.getHerb().contains(DataHashmap.GOAT)) {
    		mo.directionX(DataHashmap.GOAT);
			migration(DataHashmap.GOAT);
    		mo.directionY(DataHashmap.GOAT);
    	}
    	if(Herbivore.getHerb().contains(DataHashmap.PANDA)) {
    		mo.directionX(DataHashmap.PANDA);
			migration(DataHashmap.PANDA);
    		mo.directionY(DataHashmap.PANDA);
    	}
    	if(Primary1.getPrimary().contains(DataHashmap.PANTHER)) {
    		mo.directionX(DataHashmap.PANTHER);
			migration(DataHashmap.PANTHER);
    		mo.directionY(DataHashmap.PANTHER);
    	}
    	if(Herbivore.getHerb().contains(DataHashmap.RABBIT)) {
    		mo.directionX(DataHashmap.RABBIT);
			migration(DataHashmap.RABBIT);
    		mo.directionY(DataHashmap.RABBIT);
    	}
    	if(Herbivore.getHerb().contains(DataHashmap.SHEEP)) {
    		mo.directionX(DataHashmap.SHEEP);
			migration(DataHashmap.SHEEP);
    		mo.directionY(DataHashmap.SHEEP);
    	}
    	if(Primary1.getPrimary().contains(DataHashmap.SNAKE)) {
    		mo.directionX(DataHashmap.SNAKE);
			migration(DataHashmap.SNAKE);
    		mo.directionY(DataHashmap.SNAKE);
    	}
    	if(Primary1.getPrimary().contains(DataHashmap.SNOWLEOPARD)) {
    		mo.directionX(DataHashmap.SNOWLEOPARD);
			migration(DataHashmap.SNOWLEOPARD);
    		mo.directionY(DataHashmap.SNOWLEOPARD);
    	}
    	if(Animals.getHash().containsKey(DataHashmap.TIGER)) {
    		mo.directionX(DataHashmap.TIGER);
			migration(DataHashmap.TIGER);
    		mo.directionY(DataHashmap.TIGER);
    	}
    	if(Primary1.getPrimary().contains(DataHashmap.WOLF)) {
    		mo.directionX(DataHashmap.WOLF);
			migration(DataHashmap.WOLF);
    		mo.directionY(DataHashmap.WOLF);
    	}
    }

	
	
	
    public void run() {
		while (stop) {
			try {
				Thread.sleep(10);
				updatesValues();
			    pyr.run();
				
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}	
		}
    }
}
