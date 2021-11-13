package Problem;

import java.util.Scanner;

public class p131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		if(n==0)
			System.out.println("입력받음 정수는 0입니다.");
		else {
			String sig1=n>0?"양수입니다.":"음수입니다.";
			String sig2=n%2==0?"짝수입니다.":"음수입니다.";
			String sig3=n%3==0?"3의배수 입니다.":"3의배수가 아닙니다.";
			String sig4=n%5==0?"5의배수 입니다.":"5의배수가 아닙니다.";
			
			System.out.println("정수 "+n+"은 "+sig1);
			System.out.println("정수 "+n+"은 "+sig2);
			System.out.println("정수 "+n+"은 "+sig3);
			System.out.println("정수 "+n+"은 "+sig4);
		}
	}

}
