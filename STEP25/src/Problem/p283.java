package Problem;

import java.util.Scanner;

public class p283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the brand : ");
		String str=input.nextLine();
		String[] arr=str.split(" ");
		int[] arr2=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i].length();
		}
		
		int min1=0;
		for(int i=1; i<arr2.length; i++) {
			if(arr2[min1]>arr2[i])
				min1=i;
		}
		
		int min2=0;
		if(min1==0)
			min2=1;
		for(int i=1; i<arr2.length; i++) {
			if(arr2[min2]>arr2[i])
				min2=i;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(i==min1 || i==min2)
				continue;
			System.out.printf("%s ", arr[i]);
		}
	}

}
