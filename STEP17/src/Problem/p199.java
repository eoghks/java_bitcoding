package Problem;

import java.util.*;

public class p199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Random rd=new Random();
		System.out.printf("두 수를 입력하세요 : ");
		int num1 = input.nextInt();
		int num2= input.nextInt();
		if(num1<num2) {
			int temp = num1;
			num1= num2;
			num2=temp;
		}
		
		int rdNum =rd.nextInt(num1-num2-1)+num2+1;
		System.out.println(rdNum);
	}

}
