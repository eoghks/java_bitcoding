package 모의고사3;

import java.util.Scanner;

public class p337 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.printf("Enter the numbers :");
		String str= input.nextLine();
		String[] arr=str.split(" ");
		int[] num= new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			num[i]=Integer.parseInt(arr[i]);
		}

		int max_len=1;
		int len_final=0;
		int len=1;
		for(int i=0; i<arr.length-1; i++) {
			if(num[i] < num[i+1]) {
				len++;
				if(max_len<len) {
					max_len=len;
					len_final=i+1;
				}
					
			}
			else {
				len=1;
			}
		}
		
		System.out.print("[");
		for(int i=len_final-max_len+1; i<=len_final; i++) {
			if(i==len_final)
				System.out.printf("%d", num[i]);
			else
				System.out.printf("%d, ", num[i]);
		}
		System.out.println("]");
	}

}
