package data;

import java.util.ArrayList;

public abstract class Primary1 extends Animals{
	
	private static ArrayList<Integer> primary = new ArrayList<>();
	
	public Primary1 (int number,int strengh,int range) {
		super(number,strengh,range);
	}
	public static ArrayList<Integer> getPrimary() {
		return primary;
	}
	public static void putPrimary(int key){
		 primary.add(key);
	}
	public static int tailleArray () {
		return primary.size();
	}
}
