package 모의고사4;

import java.util.Scanner;

public class p346 {
	public static boolean cool_num(int num) {
		boolean is_cool=true;
		int n=1;
		int diff=0;
		
		while(num>=(n*10)) {
			int cul=num/n%10;
			int next=num/(n*10)%10;
			if(n==1) {
				diff=next-cul;
			}
			n=n*10;
			
			if(next-cul!=diff || diff==0) {
				is_cool=false;
				break;
			}
		}
		
		return is_cool;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num=input.nextInt();
		int count=0;
		for(int i=100; i<=num; i++) {
			if(cool_num(i)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
