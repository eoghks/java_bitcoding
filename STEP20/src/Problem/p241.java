package Problem;

import java.util.Scanner;

public class p241 {
	public static void countdown(int n) {
		if(n==0)
			return;
		else {
			System.out.println(n+" ���ҽ��ϴ�.");
			countdown(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= input.nextInt();
		countdown(num);
		System.out.println("��");
	}

}
