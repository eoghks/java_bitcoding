package Problem;

import java.util.Scanner;

public class p226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		char[] ch= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] secret={'k','l','y','d','h','n','s','z','m','a','r','q','g','x','c','u','j','b','t','v','o','e','i','p','f','w'};
		
		System.out.print("Enter the sentence : ");
		String str=input.nextLine();
		str=str.toLowerCase();
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<ch.length; j++) {
				if(str.charAt(i)==ch[j]) {
					System.out.printf("%c", secret[j]);
					break;
				}
			}
		}
	}

}
