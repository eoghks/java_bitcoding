package Problem;

import java.util.Scanner;

public class p246 {
	public static void evennum(int a, int b) {
		if(a==b)
			return;
		if(a%2==0) {
			System.out.printf("%d ",a);
			evennum(a+1,b);
		}
		else {
			evennum(a+1,  b);
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		int a=input.nextInt();
		int b=input.nextInt();
		evennum(a,b);
		
	}

}
