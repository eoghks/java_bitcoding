package example419;

public interface Human {

	String name = null;

	default String getName() {
		return name;
	}
	
	static int calculatePlus(int a, int b) {
		System.out.println((a+b));
		return a+b;
	}
	
	public void eatLunch();
}
