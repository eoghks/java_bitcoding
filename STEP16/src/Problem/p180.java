package Problem;

import java.util.Scanner;

public class p180 {
	public static int gcd(int num1, int num2) {
	int GCD=1;
	int num=num1<num2? num1:num2;
	for(int i=2;i<=num; i++) {
		if(num1%i==0&&num2%i==0)
			GCD=i;
	}
	return GCD;
	}
	
	public static int lcm(int num1, int num2) {
		int num=num1>num2? num1: num2;
		while(true) {
			if(num%num1==0&&num%num2==0) 
				break;
			num++;
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int num1= input.nextInt();
		System.out.print("Enter the 2nd number : ");
		int num2= input.nextInt();
		int GCD= gcd(num1, num2);
		int LCM= lcm(num1, num2);
		System.out.printf("GCD of %d and %d is %d\n", num1, num2, GCD);
		System.out.printf("LCM of %d and %d is %d\n", num1, num2, LCM);
	}

}
