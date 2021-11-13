package Problem;

import java.util.Scanner;

public class p184 {
	public static void sumNumber(int num) {
		while(true) {
			int sum=0;
			for(int i=1; i<=num; i*=10) {
				System.out.print(num%(i*10)/i+ " ");
				if(i<=num)
					System.out.print(" + ");
				sum+=num%(i*10)/i;
			}
			System.out.println(" = "+ sum);
			num=sum;
			if(sum<10)
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		sumNumber(num);
	}

}
