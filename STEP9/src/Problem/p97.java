package Problem;

import java.util.*;

public class p97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("<사용자 기본정보>");
		System.out.print("이름을 입력하세요. ");
		String name= input.next();
		System.out.print("나이를 입력하세요. ");
		int age= input.nextInt();
		System.out.println("당신의 이름은 "+name+", 나이는 "+age);
		input.close();
	}

}
