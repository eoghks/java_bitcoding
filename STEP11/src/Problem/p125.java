package Problem;

import java.util.Scanner;

public class p125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int year= input.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					System.out.println("����");
				else
					System.out.println("���");
			}
			else
				System.out.println("����");
		}
		else
			System.out.println("���");
		input.close();
	}

}
