package 모의고사4;

import java.util.Scanner;

public class p344 {
	
	public static boolean perm(int n) {
		if(n==1)
			return false;
		for(int i=2; i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void pnum(int num) {
		int count=0;
		for(int i=2; ; i++) {
			if(perm(i))
				count++;
			if(count==num) {
				System.out.println(i);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1= input.nextInt();
		pnum(num1);
	}

}
