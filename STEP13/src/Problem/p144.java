package Problem;

import java.util.Scanner;

public class p144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("First num : ");
		int first=input.nextInt();
		System.out.print("Second num : ");
		int second=input.nextInt();
		if(first>second) {
			int temp =first;
			first=second;
			second=temp;
		}
		
		while(first<=second) {
			if(first%5==0)
				System.out.println(first);
			first++;
		}
		
	}

}
