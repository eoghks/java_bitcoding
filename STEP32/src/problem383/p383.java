package problem383;

public class p383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Triangle{
	int a;
	int b;
	int c;
	
	Triangle(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	double area() {
		double s= (a+b+c)/2.0;
		System.out.println("����� ������ ����Ͽ����ϴ�.");
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}

class Equilateral extends Triangle{
	Equilateral(int a){
		super(a,a,a);
	}
	double area() {
		System.out.println("���ﰢ���� ���� ������ ����Ͽ����ϴ�.");
		return (a*a*Math.sqrt(3)/4);
	}
}