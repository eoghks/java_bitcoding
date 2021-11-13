package Example;

public class e191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1= Math.random();
		System.out.println(num1);
		
		int max=20; 
		int min=10;
		for(int i=0; i<10; i++) {
			int num=(int)(Math.random()*(max-min+1)+min);
			System.out.println(num);
		}
		double num2=10.99999;
		int num3=(int)num2;
		System.out.println(num3);
	}

}
