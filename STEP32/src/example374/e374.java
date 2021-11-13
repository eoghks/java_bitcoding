package example374;

public class e374 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu= new Student();
		stu.eatLunch();
	}

}

class Person{
	String name;
	int age;
	void eatLunch() {
		System.out.println("점시을 먹습니다.");
	}
}

class Student extends Person{
	String school;
	void eatLunch() {
		super.eatLunch();
		System.out.println("그 점심은 급식입니다.");
	}
}