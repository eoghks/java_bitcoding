package Problem;

import java.util.Scanner;

public class p215 {
	public static int crossProduct(int[] arr1, int[] arr2, int i) {
		int cp=arr1[((i+1)%3)]*arr2[((i+2)%3)]-arr2[((i+1)%3)]*arr1[((i+2)%3)];
		return cp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] arr1= new int[3];
		int[] arr2= new int[3];
		int[] arr3= new int[3];
		
		System.out.print("º¤ÅÍ 1 : ");
		for(int i=0; i<3; i++) {
			arr1[i]=input.nextInt();
		}
		
		System.out.print("º¤ÅÍ 2 : ");
		for(int i=0; i<3; i++) {
			arr2[i]=input.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			arr3[i]=crossProduct(arr1, arr2, i);
		}
		System.out.printf(">> µÎ º¤ÅÍÀÇ ¿ÜÀûÀº (%d, %d, %d)ÀÔ´Ï´Ù.", arr3[0], arr3[1], arr3[2]);
		
	}

}
