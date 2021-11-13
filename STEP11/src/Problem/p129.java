package Problem;

import java.util.Scanner;

public class p129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		String str=a+b>=0.5*a*b?"Nice":"Bad";
		System.out.println(str);
	}

}
