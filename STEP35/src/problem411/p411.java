package problem411;

public class p411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Heater{
	String name;
	int heat;
	Heater(String n, int heat){
		this.name=n;
		this.heat=heat;
	}
	String getName() {
		return this.name;
	}
	int getheat() {
		return heat;
	}
	
	abstract void switchOn();
}

class GasRange extends Heater{
	double gasConsume;
	GasRange(String n, int heat, double c){
		super(n, heat);
		this.gasConsume=c;
	}
	void switchOn() {
		gasConsume+=50;
		heat+=10;
	}
}

class Induction extends Heater{
	double electricityConsume;
	Induction(String n, int heat, double c){
		super(n,heat);
		this.electricityConsume=c;
	}
	void switchOn() {
		electricityConsume+=20;
		heat+=12;
	}
}
