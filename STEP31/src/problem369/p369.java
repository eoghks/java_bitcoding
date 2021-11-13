package problem369;

public class p369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Americano coffee1= new Americano("첫 번째 커피");
		Americano coffee2= new Americano("두 번째 커피");
		coffee1.addShot();
		int shotOf1=coffee1.addShot();
		coffee2.addShot();
		double syrupOf2=coffee2.addSysrup(2.5);
		System.out.println(shotOf1);
		System.out.println(syrupOf2);
		coffee1.printTaset();
		coffee2.printTaset();
	}

}

class Americano{
	String coffeeName;
	int shot;
	double syrup;
	Americano(String name){
		this.coffeeName=name;
		this.shot=1;
		this.syrup=0;
	}
	int addShot() {
		shot++;
		return shot;
	}
	double addSysrup(double syrupAmount) {
		syrup += syrupAmount;
		return syrup;
	}
	
	void printTaset() {
		if(this.syrup > 10) {
			System.out.println(this.coffeeName+"는 너무 답니다.");
		}
		else if(this.shot>2) {
			System.out.println(this.coffeeName+"는 너무 씁니다.");
		}
		else {
			System.out.println(this.coffeeName+"는 무난합니다.");
		}
			
	}
}