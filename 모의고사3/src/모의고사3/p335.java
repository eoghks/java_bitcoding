package 모의고사3;

import java.util.Scanner;

public class p335 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the phone numbers : ");
		String str= input.next();
		String[] arr= str.split("-");
		arr[1]=arr[1].substring(0, arr[1].length()-2)+"**";
		arr[2]="**"+arr[2].substring(2,arr[2].length());
		str=String.join("-", arr);
		System.out.println(str);
	}

}
