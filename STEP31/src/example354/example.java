package example354;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student(20, "JS");
		Student b = new Student("EJ");
		Student c = new Student();
		System.out.println("�л�a �̸� : "+a.n+" ���� : "+a.age);
		System.out.println("�л�a �̸� : "+b.n+" ���� : "+b.age);
		System.out.println("�л�a �̸� : "+c.n+" ���� : "+c.age);
	}

}
class Student{
	int age=0;
	String n;
	Student(int age, String n){
		this.age=age;
		this.n=n;
	}
	Student(String n){
		this.n=n;
		
	}
	Student(){
		this.n="I don't name";
	}
}
