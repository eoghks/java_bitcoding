package Problem;

import java.util.Scanner;

public class p214 {
	public static int vectorProduct(int[] arr1, int[] arr2) {
		int product=0;
		for(int i=0; i<3; i++) {
			product+=(arr1[i]*arr2[i]);
		}
		return product;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] arr1= new int[3];
		int[] arr2= new int[3];
		
		System.out.print("벡터 1 : ");
		for(int i=0; i<3; i++) {
			arr1[i]=input.nextInt();
		}
		
		System.out.print("벡터 2 : ");
		for(int i=0; i<3; i++) {
			arr2[i]=input.nextInt();
		}
		
		int product=vectorProduct(arr1, arr2);
		
		System.out.println(">> 두 벡터의 내적은 "+product+"입니다.");
	}

}
