	package example426;

public class Rectangle {
	double a;
	double h;
	String name;
	public String getFigureName() {
		return name;
	}
	public double getarea() {
		return a*h;
	}
	public int getSide() {
		return 4;
	}
	public void expandSimilarly(double x) {
		this.a=a*x;
		this.h=a*x;
	}
}
