package example426;

public class Circle implements Figure {
	double r;
	String name;
	
	public String getFigureName() {
		return this.name;
	}
	public double getarea() {
		return r*r*3.14;
	}
	
	public int getSide() {
		return Integer.MAX_VALUE;
	}
	public void expandSimilarly(double x) {
		this.r=r*x;
	}
}
