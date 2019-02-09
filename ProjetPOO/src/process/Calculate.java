package process;
import data.Bear;
import data.Herbivore;
import data.Chicken;
import data.Cow;
import  data.Goat ;
import data.Panda;
import data.Panther;
import data.Rabbit;
import data.Sheep;
import data.Snake;
import data.SnowLeopard;
import data.Wolf;

public class Calculate {
	private static final int PRODUCTION_CHICKEN = 1;
	private static final int PRODUCTION_GOAT = 7;
	private static final int PRODUCTION_COW = 30;
	private static final int PRODUCTION_PANDA = 30;
	private static final int PRODUCTION_PANTHER = 7;
	private static final int PRODUCTION_RABBIT = 1;
	private static final int PRODUCTION_SHEEP = 7;
	private static final int PRODUCTION_SNAKE = 2;
	private static final int PRODUCTION_SNOWLEOPARD = 7;
	private static final int PRODUCTION_WOLF = 4;

	Goat g=new Goat(1,0,4,10,0,0,0,0);
	Chicken ch=new Chicken(1,0,4,10,0,0,0,0);
	Cow co=new Cow(1,0,4,10,0,0,0,0);
	Panda po=new Panda(1,0,4,10,0,0,0,0);
	Panther pa=new Panther(1,0,4,10,0,0,0,0);
	Rabbit r=new Rabbit(1,0,4,10,0,0,0,0);
	Sheep sh=new Sheep(1,0,4,10,0,0,0,0);
	Snake sa=new Snake(1,0,4,10,0,0,0,0);
	SnowLeopard so=new SnowLeopard(1,0,4,10,0,0,0,0);
	Wolf w=new Wolf(1,0,4,10,0,0,0,0);
	
	public int setProductionGoat(Goat g) {
			int x,y ;
			x=g.getNumber();
			y=g.getProduction();
			y=x*PRODUCTION_GOAT;
		
		return y;
	}
	public int setProductionChicken(Chicken ch) {
		int x,y ;
		x=ch.getNumber();
		y=ch.getProduction();
		y=x*PRODUCTION_CHICKEN;
	
	return y;
}
	public int setProductionCow(Cow co) {
		int x,y ;
		x=co.getNumber();
		y=co.getProduction();
		y=x*PRODUCTION_COW;
	
	return y;
}
	public int setProductionPanda(Panda po) {
		int x,y ;
		x=po.getNumber();
		y=po.getProduction();
		y=x*PRODUCTION_PANDA;
	
	return y;
}
	public int setProductionPanther(Panther pa) {
		int x,y ;
		x=pa.getNumber();
		y=pa.getProduction();
		y=x*PRODUCTION_PANTHER;
	
	return y;
}
	public int setProductionRabbit(Rabbit r) {
		int x,y ;
		x=r.getNumber();
		y=r.getProduction();
		y=x*PRODUCTION_RABBIT;
	
	return y;
}
	public int setProductionSheep(Sheep sh) {
		int x,y ;
		x=sh.getNumber();
		y=sh.getProduction();
		y=x*PRODUCTION_SHEEP;
	
	return y;
}
	public int setProductionSnake(Snake sa) {
		int x,y ;
		x=sa.getNumber();
		y=sa.getProduction();
		y=x*PRODUCTION_SNAKE;
	
	return y;
}
	public int setProductionSnowLeopard(SnowLeopard so) {
		int x,y ;
		x=so.getNumber();
		y=so.getProduction();
		y=x*PRODUCTION_SNOWLEOPARD;
	
	return y;
}
	public int setProductionWolf(Wolf w) {
		int x,y ;
		x=w.getNumber();
		y=w.getProduction();
		y=x*PRODUCTION_WOLF;
	
	return y;
}
	public int productionHerbi() {
		int chicken,cow,goat,panda,panther,rabbit,sheep,snake,snow,wolf,a;
		chicken=setProductionChicken(ch);
		cow=setProductionCow(co);
		goat=setProductionGoat(g);
		panda=setProductionPanda(po);
		panther=setProductionPanther(pa);
		rabbit=setProductionRabbit(r);
		sheep=setProductionSheep(sh);
		snake=setProductionSnake(sa);
		snow=setProductionSnowLeopard(so);
		wolf=setProductionWolf(w);
		a=chicken+cow+goat+panda+panther+rabbit+sheep+snake+snow+wolf;
		return a;
	}
	}

