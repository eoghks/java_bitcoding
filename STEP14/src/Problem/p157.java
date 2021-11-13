package Problem;

import java.util.Scanner;

public class p157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		int count=1;
		for(;num!=1;) {
			if(num%2==0)
				num=num/2;
			else
				num=2*num+2;
			count++;
		}
		System.out.println(count);
	}

}
