package Problem;

import java.util.Scanner;

public class p128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int result;
		if(a>b)
			result=a-b;
		else
			result=b-a;
		System.out.println(result);
	}

}
