package Problem;

import java.util.Scanner;

public class p225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str=input.nextLine();
		
		String[] arr=str.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d. %s\n",i+1,arr[i]);
		}
	}

}
