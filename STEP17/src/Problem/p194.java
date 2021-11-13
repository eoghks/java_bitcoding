package Problem;

import java.util.*;

public class p194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Random rd= new Random();
		int sum=0;
		
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		System.out.print("Random Number : ");
		for(int i=0; i<5; i++) {
			int rdNum=rd.nextInt(10);
			sum+=rdNum;
			System.out.print(rdNum+" ");
		}
		double average= sum/5.0;
		if(average>num)
			System.out.println("\n>> Small");
		else if(average<num)
			System.out.println("\n>> Big");
		else
			System.out.println("\n>> Equal");
	}

}
