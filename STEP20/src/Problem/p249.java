package Problem;

import java.util.Scanner;

public class p249 {
	public static int step(int n) {
		if(n==1)//1ĭ�� ���� ����Ǽ��� 1
			return 1;
		else if(n==2)//2ĭ�� ���� ����� ���� 2
			return 2;
		else if(n==3)//3ĭ�� ���� ����� ���� 3
			return 4;
		else {
			int sum=0;
			for(int i=1; i<=3;i++) {
				sum+=step(n-i);//ó�� 1������ �Ȱ� ���� ���� ������ ���� �����Ǽ� 
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num1 =input.nextInt();
		System.out.println(step(num1));
	}

}
