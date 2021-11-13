package example;

public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=3;
		double c=4;
		
		a += b+c;//8
		b+=b++ + c++;
		int d=a*(a+b/2);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}

}
