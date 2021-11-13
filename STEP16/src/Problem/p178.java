package Problem;

import java.util.Scanner;

public class p178 {
	public static int fuc(int num) {
		int sum=0;
		for(int i=1; i<num; i++) {
			sum+=(i%5);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Num : ");
		int num=input.nextInt();
		int sum=fuc(num);
		System.out.println(sum);
	}

}
