package data;


public abstract class FoodChain extends Map {
	private int heating ;
	private int production;
	private int litter ;
	private int number ;
	private int corpse ;
	
	public FoodChain(int m,int food,int litter,int number,int corpse) {
		this.heating=m;
		this.production=food;
		this.litter=litter;
		this.number=number;
		this.corpse=corpse;
	}

	public void Level0(int proddecomposeur,int mealplante) {
	

	}
	public void Level1(int prodplante,int mealherbi) {


	}
	public void Level2(int prodherbi,int mealprimary1) {


	}
	public void Level3(int prodprimary1,int mealprimary2) {


	}
	public int getHeating() {
		return heating;
	}
	public void setMeal(int heating) {
		this.heating = heating;
	}
	public int getProduction() {
		return production;
	}
	public void setFood(int production) {
		this.production = production;
	}
	public int getLitter() {
		return litter;
	}
	public void setLitter(int litter) {
		this.litter = litter;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCorpse() {
		return corpse;
	}
	public void setCorpse(int corpse) {
		this.corpse = corpse;
	}
}
