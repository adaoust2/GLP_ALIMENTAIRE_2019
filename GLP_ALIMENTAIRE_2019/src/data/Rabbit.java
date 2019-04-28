package data;

import process.visitor.AnimalsVisitor;

public class Rabbit extends Herbivore {
	
	public Rabbit(int number, int strengh ,int range) {
		super(number,strengh,range);
	}
	
	public <T> T accept(AnimalsVisitor<T> visitor) {
		return visitor.visit(this);
	}
	
}
