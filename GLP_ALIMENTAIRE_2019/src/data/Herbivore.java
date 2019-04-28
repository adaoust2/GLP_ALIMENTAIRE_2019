package data;

import java.util.ArrayList;

public abstract class Herbivore extends Animals {
	private static ArrayList<Integer> herb = new ArrayList<>();
	

	
	public Herbivore (int number,int strengh,int range) {
		super(number,strengh,range);
	}
	public static ArrayList<Integer> getHerb() {
		return herb;
	}
	public static void putHerb(int key){
		 herb.add(key);
	}
	public static int tailleArray () {
		return herb.size();
	}
}