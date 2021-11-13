package Problem;

import java.util.*;

public class p98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		String name= input.next();
		System.out.print("키를 입력하세요. ");
		double height= input.nextDouble();
		System.out.print("몸무게를 입력하세요. ");
		int weight= input.nextInt();
		System.out.printf("당신의 이름은 %s 키는 %.1f 몸무게는 %d", name, height, weight);
		input.close();
	}

}
