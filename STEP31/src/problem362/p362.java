package problem362;

public class p362 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square(10, 8);
		System.out.println("area : "+ sq.area());
	}

}

class Square{
	double h;
	double a;
	
	Square(double h, double a){
		this.h=h;
		this.a=a;
	}
	double area() {
		return this.h*this.a;
	}
}