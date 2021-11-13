package Problem;

import java.util.Scanner;

public class p132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n1= input.nextInt();
		char op=(char)input.next().charAt(0);
		int n2= input.nextInt();
		if(op=='+') 
			System.out.println((n1+n2));
		else if(op=='-')
			System.out.println((n1-n2));
		else if(op=='*')
			System.out.println((n1*n2));
		else
			System.out.println((n1/n2));
	}

}
