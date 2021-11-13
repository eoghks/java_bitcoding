package example370;

public class e370 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person {
	String name;
	int age;
	void info() {
		System.out.println("name : "+ this.name +" age : "+ this.age);
		
	}
}

class Student extends Person{
	String school;
	void schoolInfo() {
		System.out.println("school : "+ this.school);
	}
}