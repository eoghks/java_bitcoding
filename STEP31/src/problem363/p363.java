package problem363;

public class p363 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangel t= new Triangel(3,4,5);
		System.out.println("�ﰢ���� ���� : "+ t.area());
		t.get();
	}

}

class Triangel{
	int a;
	int b;
	int c;
	
	Triangel(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	double area() {
		double s=(a+b+c)/(double)2;
		double t_area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return t_area;
	}
	
	void get() {
		if(a==b && b==c)
			System.out.println("���ﰢ���Դϴ�.");
		else if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
			System.out.println("�����ﰢ���Դϴ�.");
		else
			System.out.println("�Ϲ� �ﰢ���Դϴ�.");
	}
}
