package ProjetGLP;

public abstract class Animals extends FoodChain {
	private int age;
	private int strength;
	private int range;

	public void Mobility(int range) {
		
	}
	public void competition(int strengt1, int strength2) {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
}
