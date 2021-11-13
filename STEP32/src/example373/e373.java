package example373;

public class e373 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student myStudent = new Student();
		myStudent.eatLunch();
		Person myPerson = new Person();
		myPerson.eatLunch();
	}

}

class Person{
	String name;
	int age;
	void eatLunch() {
		System.out.println("점심을 먹습니다.");
	}
}

class Student extends Person {
	String school;
	void eatLunch() {
		System.out.println("급식을 먹습니다.");
	}
}