package Problem;

import java.util.Scanner;

public class p118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		
		System.out.printf("%d  %d\n",(n>>1)&1,(n>>4)&1);
	}

}
