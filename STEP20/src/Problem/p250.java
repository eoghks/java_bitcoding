package Problem;

import java.util.Scanner;

public class p250 {
	public static int dice(int num1, int num2, int count,int[] list) {
		int[] arr=new int[7];
		if(num1==1) {
			for(int i=0; i<7; i++) {
				arr[i]=list[i];
				System.out.printf("%d ", arr[i]);
			}
			System.out.println();
			count++;
		}
		else {
			for(int i=1; i<=6; i++) {
				if(num2-i>0) {
					for(int j=0; j<7;j++) {
						arr[j]=list[j];
					}
					
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num1 =input.nextInt();
		int num2= input.nextInt();
		int[]list= new int[7]];
		int count=dice(num1,num2,0,list);
		System.out.printf("N = %d, M= %d일 때, 경우의 수는 %d가지이다.\n", num1, num2, count);
	}

}
