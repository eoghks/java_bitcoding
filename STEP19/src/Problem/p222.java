package Problem;

import java.util.Scanner;

public class p222 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("배열 1 : ");
		String str1=input.nextLine();
		System.out.print("배열 2 : ");
		String str2=input.nextLine();
		
		String[] str_arr1=str1.split(" ");
		String[] str_arr2=str2.split(" ");
		
		int[] arr1=new int[str_arr1.length+str_arr2.length];
		for(int i=0; i<str_arr1.length; i++) {
			arr1[i]=Integer.parseInt(str_arr1[i]);
		}
		for(int i=0; i<str_arr2.length; i++) {
			arr1[str_arr1.length+i]=Integer.parseInt(str_arr2[i]);
		}
		
		
		int[][] arr2=new int[arr1.length/2+1][2];
		for(int i=0; i<arr1.length; i++) {
			arr2[i/2][i%2]=arr1[i];
		}
		
		System.out.println(">> 합친 배열");
		for(int i=0; i<arr2.length; i++) {
			for(int a : arr2[i])
				System.out.printf("%d ",a);
			System.out.println();
		}
	}

}
