package 모의고사3;

import java.util.Scanner;

public class p338 {
	public static String[] toBinary(int[] arr) {
		String[] Binary=new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			switch(arr[i]) {
			case 0 : Binary[i]= "00";
				break;
			case 1 : Binary[i] ="01";
				break;
			case 2 : Binary[i] ="10";
				break;
			case 3 : Binary[i] ="11";
				break;
			}
		}
		return Binary;
	}
	public static String[] toJae(int[] arr) {
		String[] Jaeseok=new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			switch(arr[i]) {
			case 0 : Jaeseok[i]= "0";
				break;
			case 1 : Jaeseok[i] ="101";
				break;
			case 2 : Jaeseok[i] ="110";
				break;
			case 3 : Jaeseok[i] ="111";
				break;
			}
		}
		return Jaeseok;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		String str=input.nextLine();
		String[] arr= str.split(" ");
		int[] num= new int[arr.length];
		for(int i=0; i<num.length; i++) {
			num[i]=Integer.parseInt(arr[i]);
		}
		
		String[] p1=toBinary(num);
		String[] p2=toJae(num);
		for(String a : p1)
			System.out.printf("%s ", a);
		System.out.println();
		for(String a : p2)
			System.out.printf("%s ", a);
		System.out.println();
		
		int p1_length=String.join("", p1).length();
		int p2_length=String.join("", p2).length();
		if(p1_length>p2_length) {
			System.out.printf("방식 2가 메모리를 더 적게 사용합니다. 방식 1 : %d, 방식 2 : %d\n", p1_length, p2_length);
			for(String a : p2)
				System.out.printf("%s ", a);
			System.out.println();
			
		}
		else if(p1_length<p2_length) {
			System.out.printf("방식 1이 메모리를 더 적게 사용합니다. 방식 1 : %d, 방식 2 : %d\n", p1_length, p2_length);
			for(String a : p1)
				System.out.printf("%s ", a);
			System.out.println();
		}
		else {
			System.out.printf("방식 1과 방식 2가 동일한 메모리를 사용합니다. 방식 1 : %d, 방식 2 : %d\n", p1_length, p2_length);
			for(String a : p1)
				System.out.printf("%s ", a);
			System.out.println();
			for(String a : p2)
				System.out.printf("%s ", a);
			System.out.println();
		}
		
	}

}
