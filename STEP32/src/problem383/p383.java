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
		System.out.println("헤론의 공식을 사용하였습니다.");
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}

class Equilateral extends Triangle{
	Equilateral(int a){
		super(a,a,a);
	}
	double area() {
		System.out.println("정삼각형의 넓이 공식을 사용하였습니다.");
		return (a*a*Math.sqrt(3)/4);
	}
}