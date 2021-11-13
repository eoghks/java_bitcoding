package Problem;

import java.util.Scanner;

public class p126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int  n= input.nextInt();
		String level1; int level2;
		if(n<=1000) {
			level1=Integer.toBinaryString(n);
			level2=Integer.parseInt(level1,8);
		}
		else {
			level1=Integer.toOctalString(n);
			level2=Integer.parseInt(level1,16);
		}
		System.out.println(level2);
		
	}

}
