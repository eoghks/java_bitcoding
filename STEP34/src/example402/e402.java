package example402;

public class e402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Military{
	final String belongsTo ="BitCoding Empire";
	int soldiers;
	static int totalsoldiers=0;
	
	Military(int soldiers){
		this.soldiers=soldiers;
		totalsoldiers+=soldiers;
	}
	
	String getBelongsTo() {
		return belongsTo;
	}
	
	int getSoldeiers() {
		return soldiers;
	}
	
	static int getTotalSoldiers() {
		return totalsoldiers;
	}
	
	
}

class Army extends Military{
	private int tank;
	Army(int soldiers, int tank){
		super(soldiers);
		this.tank=tank;
	}
	int getTank() {
		return tank;
	}
}

class Navy extends Military{
	private int warship;
	Navy(int soldiers, int warship){
		super(soldiers);
		this.warship=warship;
	}
	int getWarship() {
		return warship;
	}
}

class AirForce extends Military{
	private int aircraft;
	AirForce(int soldiers, int aircraft){
		super(soldiers);
		this.aircraft=aircraft;
	}
	int getAircraft() {
		return aircraft;
	}
}