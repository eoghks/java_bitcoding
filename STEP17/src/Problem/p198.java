package Problem;

import java.util.*;

public class p198 {
	public static int rBinom(int n, double p) {
		Random rd=new Random();
		int count=0;
		for(int i=0; i<n; i++) {
			double rNUm=rd.nextDouble();
			if(rNUm>p)
				count++;
		}
		return count;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("���� �� Ƚ�� : ");
		int n =input.nextInt();
		System.out.print("���� Ȯ�� : ");
		double p =input.nextDouble();
		System.out.println(rBinom(n,p));
	}

}
