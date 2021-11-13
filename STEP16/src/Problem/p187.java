package Problem;

import java.util.Scanner;

public class p187 {
	public static int numOfone(int num) {
		int count=0;
		for(int i=1; i<=num; i++) {
			int n=1;
			while(i>=n) {
				int bit_num=i/n%10;
				if(bit_num==1)
					count++;
				n*=10;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num=input.nextInt();
		System.out.println(numOfone(num));
	}

}
