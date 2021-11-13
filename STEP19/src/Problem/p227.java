package Problem;

import java.util.Scanner;

public class p227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		String str=input.nextLine();
		
		String[] arr=str.split(" ");
		int[] num_arr=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			num_arr[i]=Integer.parseInt(arr[i]);
		}
		
		int[] numCount=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			numCount[num_arr[i]-1]++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.printf("%-2d ÀÇ °³¼ö :  %d\n", i+1, numCount[i]);
		}
	}

}
