package Problem;

import java.util.Scanner;

public class p189 {
	
	public static void fun_Double(int num) {
		int i=0, j=0, k=0;
		boolean isPos= false;
		for(;i<num;i++) {
			for(;j<num;j++) {
				for(;k<num;k++) {
					if(num==i*i+j*j+k*k) {
						isPos=true;
						break;
					}	
				}
				if(isPos)
					break;
			}
			if(isPos)
				break;
		}
		if(!isPos) {
			System.out.println("Sorry");
			return;
		}
			
		if(i==0)
			System.out.printf("%d > [%d, %d]\n");
		else if(j==0)
			System.out.printf("%d > [%d, %d]\n");
		else 
			System.out.printf("%d > [%d, %d, %d]\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=input.nextInt();
		fun_Double(num);
	}

}
