package Problem;

import java.util.Scanner;

public class p154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		int sum=0;
		for(int i=1; i<=num;i*=10) {
			if(i==1) {
				sum+=num/10;
			}
			else {
				int n1=num%i;
				int n2=num/(i*10)*i;
				sum+=n1+n2;
			}
		}
		System.out.println(sum);
	}

}
