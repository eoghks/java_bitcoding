package Problem;

import java.util.Random;
import java.util.Scanner;

public class p212 {
	public static boolean checkNum(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i])
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		Scanner input= new Scanner(System.in);
		int[] arr= new int[8];
		for(int i=0; i<arr.length; i++) {
			arr[i]=rd.nextInt(20);
			System.out.printf("%d ",arr[i]);
		}
		System.out.print("\nEnter the number : ");
		int num=input.nextInt();
		
		if(checkNum(arr, num))
			System.out.printf("%d�� �����մϴ�.",num);
		else
			System.out.printf("%d�� ���������ʽ��ϴ�.",num);
	}

}
