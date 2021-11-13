package Example441;

public class Calculator {
	static void divide(int a, int b) {
		try {
			System.out.println(a/b);
			System.out.println("Hello");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누누기예외발생");
		}
	}
}
