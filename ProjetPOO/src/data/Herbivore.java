package data;


public abstract class Herbivore extends Animals {

	public Herbivore (int meal,int food,int litter,int number,int corpse,int age,int strengh,int range) {
		super(meal,food,litter,number,corpse,age,strengh,range);
	}
	public int ProdHerbivore(int productionlapin ,int productionpoule , int productionchevre , int productionmouton , int productionvache , int productionpanda  ) {
		return 0;
		
	}
	public int MealHerbi(int meallapin, int mealpoule , int mealchevre, int mealmouton , int mealvache , int mealpanda) {
		return 0;
		
	}
}
