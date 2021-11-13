package Problem;

import java.util.Scanner;

public class p242 {
	public static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= input.nextInt();
		int fac=factorial(num);
		System.out.println(fac);
	}

}
