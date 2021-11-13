package Problem;

import java.util.Scanner;

public class p232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= input.nextInt();
		int[][]arr=new int[num][num];
		int count=1;
		for(int i=0;i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i%2==0) {
					arr[j][i]=count;
				}
				else {
					arr[num-1-j][i]=count;
				}
				count++;
			}
		}
		
		for(int[] sub_arr : arr) {
			for(int a : sub_arr) {
				System.out.printf("%d ",a);
			}
			System.out.println();
		}
	}

}
