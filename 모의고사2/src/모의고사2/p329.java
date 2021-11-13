package 모의고사2;

import java.util.Scanner;

public class p329 {
	public static int get_lcm(int num1, int num2) {
		for(int i=1; i<=num2; i++) {
			for(int j=1; j<=num1; j++) {
				if(num1*i ==num2*j)
					return num1*i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String str= input.nextLine();
		String[] arr1=str.split(" ");
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=Integer.parseInt(arr1[i]);
		}
		
		int lcm=arr2[0];
		for(int i=1; i<arr2.length; i++) {
			lcm=get_lcm(lcm, arr2[i]);
		}
		
		System.out.println(lcm);
		
	}

}
