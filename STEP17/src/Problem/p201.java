package Problem;

import java.util.*;

public class p201 {
	public static double exp_random(double lambda) {
		Random rd= new Random();
		return (-Math.log(rd.nextDouble())/lambda);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("�մ� ���� ��� �ð� : ");
		double y=1/input.nextDouble();//��д����� �������� �Է¹���
		double sum=0;
		for(int i=0; i<10; i++) {
			sum+=exp_random(y);
			System.out.println(sum);
		}
	}

}
