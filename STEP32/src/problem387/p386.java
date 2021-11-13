package problem387;

public class p386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character adv=new Character("J", 2000, 30, 25, 10, 10, 10);
		Warrior war = new Warrior("K", 2000, 100, 100, 40, 20, 25);
		Archer arc= new Archer("T",1000, 120, 40, 120, 40, 30);
		Wizard wiz= new Wizard("B", 100, 300, 20, 20, 150, 10);
		
		adv.attack(war);
		adv.attack(arc);
		adv.attack(wiz);
		war.skill(adv);
		arc.skill(adv);
		wiz.skill(war);
		
		for(int i=0; i<5; i++) {
			war.attack(wiz);
		}
		
		adv.status();
		war.status();
		arc.status();
		wiz.status();
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
		if(hp<=0)
			System.out.println("Die");
		else
			System.out.printf("nickname : %s, hp : %d, mp : %d\n", this.nickName, this.hp, this.mp);
	}
}

class Archer extends Character{

	Archer(String nickName, int hp, int mp, int st, int dx, int iq, int lx) {
		super(nickName, hp, mp, st, dx, iq, lx);
	}
	
	double acc() {
		int k=(int)(Math.random()*31);
		return 0.5+0.01*k+0.01*lx;
	}
	
	void attack(Character c) {
		double att=(st+2*dx+iq)*acc();
		c.hp-=(int)att;
	}
	
	void skill(Character c) {
		double att=(4*dx)*acc();
		mp-=30;
		c.hp-=(int)att;
	}
}

class Warrior extends Character{

	Warrior(String nickName, int hp, int mp, int st, int dx, int iq, int lx) {
		super(nickName, hp, mp, st, dx, iq, lx);
	}
	
	double acc() {
		int k=(int)(Math.random()*51);
		return 0.5+0.01*k+0.01*lx;
	}
	
	void attack(Character c) {
		double att=(4*st+dx+iq)*acc();
		c.hp-=(int)att;
	}
	
	void skill(Character c) {
		double att=(8*st)*acc();
		mp-=10;
		c.hp-=(int)att;
	}
}

class Wizard extends Character{

	Wizard(String nickName, int hp, int mp, int st, int dx, int iq, int lx) {
		super(nickName, hp, mp, st, dx, iq, lx);
	}
	
	double acc() {
		int k=(int)(Math.random()*71);
		return 0.5+0.01*k+0.01*lx;
	}
	
	void attack(Character c) {
		double att=(2*dx+4*iq)*acc();
		c.hp-=(int)att;
	}
	
	void skill(Character c) {
		double att=(10*iq)*acc();
		mp-=50;
		c.hp-=(int)att;
	}
}