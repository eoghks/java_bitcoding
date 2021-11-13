package Problem;

import java.util.Scanner;

public class p181 {
	public static int reverseNum(int num) {
		String str1=Integer.toString(num);
		String str2="";
		for(int i=str1.length();i>0;i--)
			str2+=str1.substring(i-1,i);
		num=Integer.parseInt(str2);
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= input.nextInt();
		num=reverseNum(num);
		System.out.println(num);
	}

}
