package Problem;

import java.util.Scanner;

public class p179 {
	public static void wordlist(String str) {
		str= str.toUpperCase();
		String [] strNum=str.split(" ");
		for(int i=0; i<strNum.length; i++) {
			System.out.println(strNum[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Eneter Sentence : ");
		String str=input.nextLine();
		wordlist(str);
	}

}
