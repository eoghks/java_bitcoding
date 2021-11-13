package problem;

public class p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=2;
		a+=b+=3; //b=5, a=6;
		System.out.printf("%d %d \n", a,b);
		a*= a++ +b++;//
		
		System.out.println(a);
		
	}

}
