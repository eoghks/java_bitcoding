package Problem;

import java.util.Scanner;

public class p249 {
	public static int step(int n) {
		if(n==1)//1칸을 오를 경우의수는 1
			return 1;
		else if(n==2)//2칸을 오를 경우의 수는 2
			return 2;
		else if(n==3)//3칸을 오를 경우의 수는 3
			return 4;
		else {
			int sum=0;
			for(int i=1; i<=3;i++) {
				sum+=step(n-i);//처음 1걸음을 걷고 나서 남은 걸음을 걸을 가지의수 
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
