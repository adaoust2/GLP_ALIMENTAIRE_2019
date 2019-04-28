package data;

import process.visitor.AnimalsVisitor;

public class Snake extends Primary1{
	
	public Snake (int number,int strengh,int range) {
		super(number,strengh,range);
	}
	
	public <T> T accept(AnimalsVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
