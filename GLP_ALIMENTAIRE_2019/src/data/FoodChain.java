package data;


public abstract class FoodChain extends Map {
	private int number ;
	private int strength;
	
	public FoodChain(int number,int str) {
		this.number=number;
		this.strength=str;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
}
