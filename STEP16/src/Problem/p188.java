package Problem;

import java.util.Scanner;

public class p188 {
	public static boolean SelfNum(int num) {
		for(int i=1; i<num; i++) {
			int dNum=dNumFun(i);
			if(dNum==num)
				return false;
		}
		return true;
	}
	
	public static int dNumFun(int i) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=i;
		while(i>=n) {
			int bitNum=i/n%10;
			sum+=bitNum;
			n*=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num= input.nextInt();
		boolean isSelf=SelfNum(num);
		if(isSelf)
			System.out.println(num+"은 셀프넘버입니다.");
		else
			System.out.println(num+"은 셀프넘버가 아닙니다.");
	}

}
