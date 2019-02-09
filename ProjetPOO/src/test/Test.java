package test;
import data.Chicken;
import data.Cow;
import data.Goat;
import data.Panda;
import data.Panther;
import data.Rabbit;
import data.Sheep;
import data.Snake;
import data.SnowLeopard;
import data.Wolf;
import process.Calculate;
public class Test {
	public static void main (String[] args){
		int a;
		Calculate cal = new Calculate();
		Goat c = new Goat(1,0,4,10,0,0,0,0);
		Chicken ch=new Chicken(1,0,4,10,0,0,0,0);
		Cow co=new Cow(1,0,4,10,0,0,0,0);
		Panda po=new Panda(1,0,4,10,0,0,0,0);
		Panther pa=new Panther(1,0,4,10,0,0,0,0);
		Rabbit r=new Rabbit(1,0,4,10,0,0,0,0);
		Sheep sh=new Sheep(1,0,4,10,0,0,0,0);
		Snake sa=new Snake(1,0,4,10,0,0,0,0);
		SnowLeopard so=new SnowLeopard(1,0,4,10,0,0,0,0);
		Wolf w=new Wolf(1,0,4,10,0,0,0,0);
		
		a=cal.productionHerbi();
		System.out.println(a);
	
	
	}
}
