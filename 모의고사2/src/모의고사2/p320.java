package 모의고사2;

import java.util.Scanner;

public class p320 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row=input.nextInt()+1;
		System.out.print("Enter the colum : ");
		int colum=input.nextInt()+1;
		System.out.println(colum-row);
	}

}
