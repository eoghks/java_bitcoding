package example354;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student(20, "JS");
		Student b = new Student("EJ");
		Student c = new Student();
		System.out.println("학생a 이름 : "+a.n+" 나이 : "+a.age);
		System.out.println("학생a 이름 : "+b.n+" 나이 : "+b.age);
		System.out.println("학생a 이름 : "+c.n+" 나이 : "+c.age);
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
