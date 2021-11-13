package Problem;

import java.util.Scanner;

public class p231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		String str= input.nextLine();
		String[] arr=str.split(" ");
		
		int[][] i_arr=new int[arr.length][arr.length];
		for(int i=0; i<arr.length; i++) {
			i_arr[0][i]=Integer.parseInt(arr[i]);
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				i_arr[i][j]=Integer.parseInt(arr[(i+j)%arr.length]);
			}
		}
		
		
		for(int[] sub_arr : i_arr) {
			for(int a : sub_arr) {
				System.out.printf("%d ", a);
			}
			System.out.println();
		}
	}

}
