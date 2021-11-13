package Problem;

import java.util.Scanner;

public class p152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		boolean prime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0)
				prime=false;
		}
		if(prime)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}

}
