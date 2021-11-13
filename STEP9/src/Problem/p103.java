package Problem;

import java.util.*;

public class p103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("년도를 입력하세요. ");
		int year=input.nextInt();
		System.out.printf("%d년 지수의 나이는 %d입니다.\n", year, year-2017+20);
		input.close();
	}

}
