package example352;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.name="Jason";
		student1.age=23;
		student1.selfIntroduce();
	}

}

class Student {
	String name;
	int age;
	void selfIntroduce() {
		System.out.println("�� �̸��� "+name+"�̰� ���̴� "+age+"���Դϴ�.");
	}
}
