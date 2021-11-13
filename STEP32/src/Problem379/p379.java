package Problem379;

public class p379 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Car{
	int minV;
	int maxV;
	
	Car(int min, int max){
		this.minV=min;
		this.maxV=max;
	}
}

class SportCar extends Car{
	int zero_to_100;
	SportCar(int a, int b, int c){
		super(a,b);
		this.zero_to_100= c;
	}
}