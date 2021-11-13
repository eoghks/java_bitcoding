package 모의고사2;

import java.util.Scanner;

public class p328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= input.nextInt();
		StringBuffer strBuff=new StringBuffer("");
		int n=7;
		String str="";
		while(true) {
			str+=Integer.toString(num%n);
			
			if(num/n==0)
				break;
			
			num=num/n;
		}
		
		strBuff.append(str);
		System.out.println(strBuff.reverse());
	}

}
