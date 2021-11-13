package 모의고사3;

import java.util.Scanner;

public class p332 {
	public static String simplest(String str) {
		String[] arr=str.split(":");
		int num1=Integer.parseInt(arr[0]);
		int num2=Integer.parseInt(arr[1]);
		int mul=1;
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0)
				mul=i;
		}
		arr[0]=Integer.toString(num1/mul);
		arr[1]=Integer.toString(num2/mul);
		String result= String.join(":", arr);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		String str=input.nextLine();
		String result = simplest(str);
		System.out.println(result);
	}

}
