package Example443;

public class Calculator {
	static void divide(int[] alist, int a, int b) {
		try {
			System.out.println(alist[a]/alist[b]);
		}catch(ArithmeticException e) {
			System.out.println("0���� �������⿹�ܹ߻�!!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception �߻�!!");
		}finally {
			System.out.println("** divide finished **");
		}
	}
}
