package Problem;

public class p182 {
	public static int fun(int a, int b) {
		if(a>b) 
			a=funA(a);
		else
			b=funB(a);
		return a+b;
	}
	private static int funA(int a) {
		// TODO Auto-generated method stub
		return funB(a++ +1);
	}
	private static int funB(int b) {
		// TODO Auto-generated method stub
		return (++b +1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=1;
		a=fun(a,b);
		b=fun(a,b);
		System.out.printf("%d %d\n", a, b);
	}

}
