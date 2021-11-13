package Example;

import java.util.*;

public class e95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.print("이름은?");
		String name= input.next();
		System.out.print("나이은?");
		int age= input.nextInt();
		System.out.print("학점은?");
		Float grade= input.nextFloat();
		System.out.println(name+" "+age+"살, 학점은"+grade);
		input.close();
	}

}
