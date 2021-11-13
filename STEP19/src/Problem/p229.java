package Problem;

import java.util.Scanner;

public class p229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] arr=new int[100];
		int i=0;
		for(; i<arr.length; i++) {
			System.out.print("Enter the number : ");
			arr[i]=input.nextInt();
			if(arr[i]==0)
				break;
		}
		
		for(;i>0;i--) {
			System.out.printf("%d ", arr[i-1]);
		}
	}

}
