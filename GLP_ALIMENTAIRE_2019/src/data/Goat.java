package data;

import process.visitor.AnimalsVisitor;

public class Goat extends Herbivore{
	
	
	public Goat(int number, int strengh ,int range) {
		super(number,strengh,range);
	}
	public <T> T accept(AnimalsVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}	
	
	


