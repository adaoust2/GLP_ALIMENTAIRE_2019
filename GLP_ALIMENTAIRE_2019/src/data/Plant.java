package data;


public class Plant extends FoodChain {
	private int litter;
	
	public Plant (int litter,int number,int str) {
		super(number,str);
		this.litter=litter;
	}

	public int getLitter() {
		return litter;
	}

	public void setLitter(int litter) {
		this.litter = litter;
	}

}
