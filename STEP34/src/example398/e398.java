package example398;

public class e398 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student tom= new Student ("Tom",19);
		Student sher = new Student("Sherry", 18);
		Student jasn = new Student("Jason", 23);
		System.out.println("현재 학생 수 : "+Student.noOFStudents);
	}

}

class Student{
	String name;
	int age;
	static int noOFStudents=0;
	Student(String n, int a){
		this.name=n;
		this.age=a;
		System.out.println(++this.noOFStudents);
	}
}