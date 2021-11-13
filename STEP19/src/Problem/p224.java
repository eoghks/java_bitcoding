package Problem;

import java.util.Scanner;

public class p224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] arr=new int[10] ;
		System.out.printf("Enter the two number : ");
		arr[0]= input.nextInt();
		arr[1]=input.nextInt();
		
		for(int i=2; i<10; i++) {
			arr[i]=arr[i-1]*arr[i-2]%10;
		}
		
		System.out.print("[");
		for(int i=0; i<10; i++)
			System.out.printf("%d ", arr[i]);
		System.out.println("]");
	}

}
