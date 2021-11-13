package example401;

public class e401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle(10);
		System.out.println(c1.getArea());
	}

}

class Circle{
	final double pi=3.14;
	double radius;
	Circle(double r){
		this.radius=r;
	}
	
	double getArea() {
		return pi*radius*radius;
	}
}
