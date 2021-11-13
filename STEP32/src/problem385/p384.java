package problem385;

public class p384 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class BaseballPlayer{
	String playerName;
	double stamina;
	double salary;
	
	BaseballPlayer(String playerName, double stamina, double salary){
		this.playerName=playerName;
		this.stamina=stamina;
		this.salary=salary;
	}
	void tranining(){
		stamina++;
	}
}

class Batter extends BaseballPlayer{
	double contact;
	
	Batter(String playerName, double stamina, double salary, double contact){
		super(playerName, stamina, salary);
		this.contact=contact;
	}
	
	void tranining() {
		super.tranining();
		contact+=2;
	}
	
	boolean vsPitcher(Pitcher p) {
		boolean vs=false;
		if((this.stamina+2*this.contact)>(p.stamina+0.5*p.ballSpeed)) {
			vs=true;
			System.out.println("½Â¸®");
		}
		else
			System.out.println("ÆÐ¹è");
		return vs;
	}
}

class Pitcher extends BaseballPlayer{
	double ballSpeed;
	Pitcher(String playerName, double stamina, double salary, double ballSpeed){
		super(playerName, stamina, salary);
		this.ballSpeed=ballSpeed;
	}
	void tranining() {
		super.tranining();
		ballSpeed++;
	}
	boolean vsBatter (Batter b) {
		boolean vs=false;
		if((this.stamina+2*this.ballSpeed)>(b.stamina+0.5*b.contact)) {
			vs=true;
			System.out.println("ÆÐ¹è");
		}
		else
			System.out.println("½Âºñ");
		return vs;
	}
	
}
