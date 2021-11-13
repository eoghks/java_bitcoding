package example400;

public class e400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.name);
		System.out.println(Calculator.intPlus(3, 4));
		System.out.println(Calculator.intMinus(5, 7));
	}

}

class Calculator{
	public static String name="간단한 계산기";
	public String istanceName;
	public static int intPlus(int a, int b) {
		return a+b;
	}
	public static int intMinus(int a, int b) {
		return a-b;
	}
	public static void setName(String n) {
		name =n;
	}
}
