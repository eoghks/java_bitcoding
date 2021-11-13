package Problem;

import java.util.Scanner;

public class p143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char ch= ' ';
		while(ch!='q') {
			System.out.print("Enter the alphabet : ");
			ch=input.next().charAt(0);
		}
		System.out.println("Finish");
	}

}
