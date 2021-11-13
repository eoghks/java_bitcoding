package problem382;

public class p382 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Car{
	double minV;
	double maxV;
	double distance=0;
	
	Car(double minV, double maxV){
		this.minV=minV;
		this.maxV=maxV;
	}
	
	void drive() {
		distance+=maxV/2;
	}
	
}


class SportCar extends Car{
	boolean rush;
	
	SportCar(double minV, double maxV, boolean rush){
		super(minV, maxV);
		this.rush=rush;
	}
	
	void dirive() {
		if(rush)
			distance*=1.8;
		else
			distance*=1.5;
	}
}