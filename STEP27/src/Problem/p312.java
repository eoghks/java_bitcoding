package Problem;

import java.util.Scanner;

public class p312 {
	public static int n_123(int n) {
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 4;
		return n_123(n-1)+n_123(n-2)+n_123(n-3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n= input.nextInt();
		System.out.println(n_123(n));
	}

}
