package 모의고사4;

import java.util.Scanner;

public class p342 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		String str= input.nextLine();
		String[] arr= str.split(" ");
		int[] num_divide_11=new int [arr.length];
		for(int i=0; i<arr.length; i++) {
			num_divide_11[i]=Integer.parseInt(arr[i])%11;
		}
		int count =0;
		
		for(int i=0;i<arr.length; i++) {
			boolean diff= true;
			for(int j=i+1;j<arr.length; j++ ) {
				if(num_divide_11[i]==num_divide_11[j])
					diff=false;
			}
			if(diff)
				count++;
		}
		
		System.out.println(count);
	}

}
