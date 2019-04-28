package data;

import java.util.HashMap;

public abstract class Animals extends FoodChain {
	private int age;
	private int range;
	private static HashMap< Integer , FoodChain> anima = new HashMap< Integer , FoodChain >();
	
	public Animals (int number,int str,int r) {
		super(number,str);
		this.range=r ;
	}
	public static void addAnimals(Integer  name , FoodChain animals) {
		anima.put(name, animals);
	}
	public static FoodChain getValue(Integer name) {
		if (anima.containsKey(name)) {
			 anima.get(name);
		}
		return anima.get(name);
	}
	
	public int Taille () {
		return anima.size();
	}

	public static HashMap<Integer, FoodChain> getHash() {
		return anima;
	}

	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
}
