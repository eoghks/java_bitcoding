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
		System.out.print("½ÇÇà ÇÒ È½¼ö : ");
		int n =input.nextInt();
		System.out.print("¼º°ø È®·ü : ");
		double p =input.nextDouble();
		System.out.println(rBinom(n,p));
	}

}
