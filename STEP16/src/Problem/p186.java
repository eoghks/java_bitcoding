package Problem;

import java.util.Scanner;

public class p186 {
	public static boolean fun(long num) {
		for(int i=0; i<=9; i++) {
			int i_count=0;
			long n=1;
			while(num>n) {
				int bit_num=(int)(num/n%10);
				if(bit_num==i)
					i_count++;
				n*=10;
			}
			if(i_count!=1)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		long num= input.nextLong();
		System.out.println(fun(num));
	}

}
