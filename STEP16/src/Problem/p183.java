package Problem;

import java.util.Scanner;

public class p183 {
	public static void swap(int num, int i, int j) {
		if(num<Math.pow(10, i-1)||num<Math.pow(10, j-1))
			System.out.println("½ÇÆÐ");
		else {
			int a= num%(int)Math.pow(10,i)/(int)Math.pow(10,i-1);
			int b= num%(int)Math.pow(10, j)/(int)Math.pow(10, j-1);
		
			num=num-(a*(int)Math.pow(10, i-1))-(b*(int)Math.pow(10, j-1))
				+(a*(int)Math.pow(10, j-1))+(b*(int)Math.pow(10, i-1));
			System.out.println(num);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		System.out.print("change number i, j : ");
		int i= input.nextInt();
		int j= input.nextInt();
		swap(num, i, j);
	}

}
