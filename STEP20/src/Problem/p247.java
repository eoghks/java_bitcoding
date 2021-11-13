package Problem;

import java.util.Scanner;

public class p247 {
	public static void colach(int num) {
		if(num==1) {
			System.out.println("1");
			return;
		}
		System.out.printf("%d -> ", num);
		if(num%2==0) {
			num/=2;
		}
		else {
			num=3*num+1;
		}
		colach(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num =input.nextInt();
		colach(num);
	}

}
