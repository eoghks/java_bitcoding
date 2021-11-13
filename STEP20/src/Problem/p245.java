package Problem;

import java.util.Scanner;

public class p245 {
	public static long exp(int n1, int n2) {
		if(n2==1)
			return n1;
		else
			return n1*exp(n1,n2-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		int num1= input.nextInt();
		int num2=input.nextInt();
		long e=exp(num1, num2);
		System.out.println(e);
	}

}
