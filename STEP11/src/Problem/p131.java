package Problem;

import java.util.Scanner;

public class p131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		if(n==0)
			System.out.println("�Է¹��� ������ 0�Դϴ�.");
		else {
			String sig1=n>0?"����Դϴ�.":"�����Դϴ�.";
			String sig2=n%2==0?"¦���Դϴ�.":"�����Դϴ�.";
			String sig3=n%3==0?"3�ǹ�� �Դϴ�.":"3�ǹ���� �ƴմϴ�.";
			String sig4=n%5==0?"5�ǹ�� �Դϴ�.":"5�ǹ���� �ƴմϴ�.";
			
			System.out.println("���� "+n+"�� "+sig1);
			System.out.println("���� "+n+"�� "+sig2);
			System.out.println("���� "+n+"�� "+sig3);
			System.out.println("���� "+n+"�� "+sig4);
		}
	}

}
