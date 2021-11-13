package Problem;

import java.util.*;

public class P105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		
		System.out.print("문장을 입력하세요. ");
		String str=input.nextLine();
		System.out.printf("해당 문장의 단어 수는 %d개입니다.\n", str.split(" ").length);
		
		input.close();
	}

}
