package Problem;

import java.util.Scanner;

public class p248 {
	
	public static int colach_count(int num,int count) {
		if(num==1) {
			return count;
		}
		if(num%2==0) {
			num/=2;
		}
		else {
			num=3*num+1;
		}
		count++;
		return colach_count(num, count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num1 =input.nextInt();
		int num2= input.nextInt();
		int max;
		System.out.println(num1+" : "+colach_count(num1,1));
		if(colach_count(num1,1)>colach_count(num2,1))
			max=num1;
		else
			max=num2;
		System.out.println(max);
	}

}
