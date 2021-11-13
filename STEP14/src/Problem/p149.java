package Problem;

import java.util.Scanner;

public class p149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("정수를 하나를 입력하세요 : ");
		int num=input.nextInt();
		int total=0;
		for(int i=1;i<=num;i++) {
			total+=i;
		}
		System.out.println("1부터 "+num+"까지의 합은 "+total);
	}

}
