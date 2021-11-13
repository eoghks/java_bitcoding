package Example443;

public class Calculator {
	static void divide(int[] alist, int a, int b) {
		try {
			System.out.println(alist[a]/alist[b]);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누누기예외발생!!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception 발생!!");
		}finally {
			System.out.println("** divide finished **");
		}
	}
}
