package problem386;

public class p386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Character{
	String nickName;
	int hp;
	int mp;
	int st;
	int dx;
	int iq;
	int lx;
	
	Character(String nickName, int hp, int mp, int st, int dx, int iq, int lx){
		this.nickName=nickName;
		this.hp=hp;
		this.mp=mp;
		this.st=st;
		this.dx=dx;
		this.iq=iq;
		this.lx=lx;
	}
	
	double acc() {
		int k =(int)(Math.random()*51);
		return 0.5+0.01*k+0.01*lx;
	}
	
	void attack(Character c) {
		double att=(st+dx+iq)*acc();
		c.hp-=(int)att;
	}
	
	void status() {
		if(hp==0)
			System.out.println("Die");
		else
			System.out.printf("nickname : %s, hp : %d, mp : %d\n", this.nickName, this.hp, this.mp);
	}
}