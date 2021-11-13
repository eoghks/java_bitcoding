package Problem;

import java.util.Scanner;

public class p155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter : ");
		String str=input.next();
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			int ch=(int)str.charAt(i);
			sum+=ch;
		}
		System.out.println(sum);
	}

}
