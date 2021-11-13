package problem384;

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
}
