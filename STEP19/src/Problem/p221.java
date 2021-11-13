package Problem;

import java.util.Scanner;

public class p221 {
	public static String[][] makeString(String str1, String str2){
		String[] arr1=str1.split(" ");
		String[] arr2=str2.split(" ");
		String[][] reslut= {arr1,arr2};
		return reslut;
	}
	
	public static int[][] toIntArr(String str1, String str2){
		String[] arr1=str1.split(" ");
		String[] arr2=str2.split(" ");
		int[] int_arr1=new int[arr1.length];
		int[] int_arr2=new int[arr2.length];
		for(int i=0; i<arr1.length; i++) {
			int_arr1[i]=Integer.parseInt(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			int_arr2[i]=Integer.parseInt(arr2[i]);
		}
		int[][] result= {int_arr1, int_arr2};
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("배열 1 : ");
		String str1=input.nextLine();
		System.out.print("배열 2 : ");
		String str2=input.nextLine();
		//String[][] arr=makeString(str1, str2);
		int[][] arr=toIntArr(str1, str2);
		
		System.out.println("합친 배열 >> ");
		for(int i=0; i<arr.length; i++) {
			for(int e : arr[i]) {
				System.out.printf("%d ", e);
			}
			System.out.println();
		}
	}

}
