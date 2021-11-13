package 모의고사2;

import java.util.Scanner;

public class p322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str= input.nextLine();
		str=str.toUpperCase();
		String[] arr=str.split(" ");
		String str2="";
		for(int i=0; i<arr.length; i++) {
			str2=str2+arr[i].charAt(0);
		}
		
		System.out.println(str2);
	}

}
