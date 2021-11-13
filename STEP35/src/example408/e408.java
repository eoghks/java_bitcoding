package example408;

public class e408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.name="Sherry";
		System.out.println(s.getName());
	}

}

abstract class Human{
	String name;
	String getName() {
		return name;
	}
	abstract void eatLunch();
}

class Student extends Human{
	String school;
	void eatLunch() {
		System.out.println("급식을 먹습니다.");
	}
}