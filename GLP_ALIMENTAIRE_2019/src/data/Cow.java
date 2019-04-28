package data;

import process.visitor.AnimalsVisitor;

public class Cow extends Herbivore {

	public Cow(int number,int strengh ,int range) {
		super(number,strengh,range);
	}
	
	public <T> T accept(AnimalsVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
