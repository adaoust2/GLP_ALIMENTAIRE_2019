package data;

public abstract class Animals extends FoodChain {
	private int age;
	private int strength;
	private int range;
	
	public Animals (int heating,int production,int litter,int number,int corpse,int a,int str,int r) {
		super(heating,production,litter,number,corpse);
		this.age=a ;
		this.strength=str ;
		this.range=r ;
	}
	public void Mobility(int range) {
		range=getRange();
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
