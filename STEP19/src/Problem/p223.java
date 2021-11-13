package Problem;

import java.util.Scanner;

public class p223 {

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
		
		int i=1;
		int sum=0;
		
		for(; ;sum+=i) {
			if(sum>=arr1.length)
				break;
			i++;
		}
		
		System.out.println(i);
		
		int[][] arr2=new int[i][i];
		int count=0;
		for(int j=0; j<i; j++) {
			for(int k=0; k<=j; k++) {
				arr2[j][k]=arr1[count];
				count++;
				if(count>=arr1.length)
					break;
			}
			if(count>=arr1.length)
				break;
		}
		for(int[] arr3 : arr2) {
			for(int a : arr3) {
				System.out.printf("%-2d ", a);
			}
			System.out.println();
		}
		
		
		
	}

}
