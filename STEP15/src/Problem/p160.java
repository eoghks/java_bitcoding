package Problem;

import java.util.Scanner;

public class p160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str=input.nextLine();
		for(int i=0; i<=str.length(); i++) {
			for(int j=0; j<=i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.printf("\n");
		}
		
	}

}
