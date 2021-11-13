package Problem;

import java.util.Scanner;

public class p166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		boolean check1=false;
		boolean check2=false;
		boolean check=false;
		int n1=2, n2=-1;
		for(; n1<num/2+1;n1++) {
			if(num%n1==0) {
				n2=num/n1;
				
				for(int j=2;j<n1;j++) {
					if(n1%j==0) {
						check1=false;
						break;
					}
					else
						check1=true;
				}
				
				for(int j=2;j<n2;j++) {
					if(n2%j==0) {
						check2=false;
						break;
					}
					else
						check2=true;
				}
				
				if(check1&&check2) {
					break;
				}
	
			}
		}
		check=check1&&check2;
		if(check)
			System.out.printf("%d =%d * %d \n", n2*n1, n2, n1);
		else
			System.out.println("wrong number");
	}

}
