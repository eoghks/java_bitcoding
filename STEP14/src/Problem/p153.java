package Problem;

import java.util.Scanner;

public class p153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		int sum =0;
		for(int i=1;i<=num;i*=10) {
			sum+=(num%(i*10)-num%i)/i;
		}
		System.out.println(sum);
	}

}
