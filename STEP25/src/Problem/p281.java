package Problem;

import java.util.Scanner;

public class p281 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		String str=input.nextLine();
		String[] arr1=str.split(" ");
		int[] arr2=new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=Integer.parseInt(arr1[i]);
		}
		
		for(int a : arr2) {
			System.out.println(a);
		}
	}

}
