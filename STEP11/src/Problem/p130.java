package Problem;

import java.util.Scanner;

public class p130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int min=a>b?b:a;
		System.out.println(min);
		min=min>c?c:min;
		System.out.println(min);
		
	}

}
