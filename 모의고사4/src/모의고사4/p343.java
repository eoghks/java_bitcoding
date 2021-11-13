package 모의고사4;

import java.util.Scanner;

public class p343 {
	public static int sum_perm(int num1, int num2) {
		if(num1>num2) {
			int temp=num1;
			num1=num2;
			num2=num1;
		}
		int sum=0;
		for(int i=num1+1; i<num2; i++) {
			if(perm(i))
				sum+=i;
		}
		
		return sum;
	}
	
	public static boolean perm(int n) {
		if(n==1)
			return false;
		for(int i=2; i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1= input.nextInt();
		System.out.print("Enter the num2 : ");
		int num2= input.nextInt();
		int sum=sum_perm(num1, num2);
		System.out.println(sum);
	}

}
