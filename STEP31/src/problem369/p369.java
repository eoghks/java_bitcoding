package problem369;

public class p369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Americano coffee1= new Americano("ù ��° Ŀ��");
		Americano coffee2= new Americano("�� ��° Ŀ��");
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
			System.out.println(this.coffeeName+"�� �ʹ� ��ϴ�.");
		}
		else if(this.shot>2) {
			System.out.println(this.coffeeName+"�� �ʹ� ���ϴ�.");
		}
		else {
			System.out.println(this.coffeeName+"�� �����մϴ�.");
		}
			
	}
}