package ���ǰ��2;

import java.util.Scanner;

public class p325 {
	public static boolean is_bitnum(int num) {
		int n=1;
		int sum=0;
		while(num>=n) {
			sum+=num/n%10;
			n*=10;
		}
		if(num%sum==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= input.nextInt();
	
		if(is_bitnum(num))
			System.out.println(num+"�� ������ �� �Դϴ�.");
		else
			System.out.println(num+"�� ������ ���� �ƴմϴ�.");
	}

}
