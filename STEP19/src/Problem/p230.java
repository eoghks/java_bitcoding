package Problem;

import java.util.Scanner;

public class p230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the nubmer : ");
		int num=input.nextInt();
		int[][] arr=new int[num][num];
		
		arr[0][0]=1;
		for(int i=0; i<num; i++) {
			arr[0][i]=1;
			arr[i][0]=1;
		}
		
		
		for(int i=1; i<num; i++) {
			for(int j=1; j<num; j++) {
				arr[i][j]=arr[i-1][j]+arr[i][j-1];
			}
		}
		
		for(int[] sub_arr : arr) {
			for(int a : sub_arr) {
				System.out.printf("%-3d ", a);
			}
			System.out.println();
		}
	}

}
