package 모의고사2;

import java.util.Scanner;

public class p318 {
	public static int func1(int num) {
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i*i;
		}
		return sum;
	}
	public static int func2(int num) {
		int sum =0;
		for(int i=1; i<=num; i++)
			sum+=i;
		sum=(int)Math.pow(sum, 2);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		int powOfSum=func1(num);
		int sumOfPow=func2(num);
		int diff= Math.abs(sumOfPow-powOfSum);
		System.out.printf("합의 제곱 : %d, 제곱의 합 : %d, 둘의 차이 : %d\n", powOfSum, sumOfPow, diff);
	}

}
