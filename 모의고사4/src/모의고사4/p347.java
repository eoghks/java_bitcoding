package 모의고사4;

import java.util.Scanner;

public class p347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		String str= input.nextLine();
		String[] arr=str.split(" ");
		int[] num= new int[arr.length];
		int[] result=new int[20];
		for(int i=0; i<num.length; i++) {
			num[i]=Integer.parseInt(arr[i]);
			result[num[i]-1]++;
		}
		
		for(int i=0; i<20; i++) {
			if(result[i]==1)
				System.out.printf("%d ", i+1);
		}
	}

}
