package Problem;

import java.util.Scanner;

public class p235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		int num1 = input.nextInt();//row
		int num2 = input.nextInt();//column
		int[][] arr= new int[num1][num2];
		
		
		
		arr[0][0] = 1;
		for(int i=1; i<num2; i++) {
			arr[0][i]=arr[0][i-1] + i;
		}
		
		int count=num2-1;
		for(int i=1; i<num1; i++ ) {
			for(int j=0; j<num2; j++) {
				if(j<num2-1)
					arr[i][j]=arr[i-1][j+1]+1;
				else
					arr[i][j]=arr[i-1][j]+num1-i+1;
			}
		}
		
		int[][] arr2=new int[num1][num2];
		
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				arr2[i][j]=arr[num1-1-i][num2-1-j];
			}
		}
		
		
		
		for(int[] sub_arr : arr2) {
			for(int a : sub_arr) {
				System.out.printf("%d ", a);
			}
			System.out.println();
		}
	}

}
