package Example;

import java.util.Scanner;

public class e158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sum=0;
		while(sum<=20) {
			sum=0;
			System.out.println("Enter the number : ");
			int num=input.nextInt();
			while(num>=1) {
				sum+=num/10; 
				num/=10;
			}
		}
		System.out.println("Finish");
	}

}
