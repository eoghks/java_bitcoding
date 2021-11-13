package problem367;

public class p367 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Point{
	double x;
	double y;
	
	Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	void SetX(int x){
		this.x =x;
	}
	void SetY(int y){
		this.y =y;
	}
	
	void get() {
		System.out.println("{"+this.x+", "+this.y+"}");
	}
	boolean OntheAxis() {
		if(this.x==0||this.y==0)
			return true;
		else
			return false;
	}
	
	void move(double dx, double dy) {
		this.x= this.x+dx;
		this.y= this.y+dy;
	}
}