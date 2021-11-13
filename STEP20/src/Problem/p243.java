package Problem;

import java.util.Scanner;

public class p243 {
	public static boolean is_palindrome(String str) {
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str=input.next();
		boolean palindrome =is_palindrome(str);
		if(palindrome)
			System.out.println("회문 입니다.");
		else
			System.out.println("회문이 아닙니다.");
	}

}
