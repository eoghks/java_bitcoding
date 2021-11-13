package Problem;

import java.util.Scanner;

public class p244 {
	public static int fibonacci(int num) {
		if(num==1||num==2)
			return 1;
		else
			return (fibonacci(num-1)+fibonacci(num-2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num =input.nextInt();
		System.out.println(fibonacci(num));
	}

}
