package example353;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student2= new Student("����", 24);
		System.out.println(student2.name);
		System.out.println(student2.age);
	}

}

class Student{
	String name;
	int age;
	Student(String n, int age){
		this.name = n;
		this.age= age;
		System.out.println("Student ��ü ���� �Ϸ�");
	}
}