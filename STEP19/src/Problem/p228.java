package Problem;

import java.util.Scanner;

public class p228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter first : ");
		String str1=input.next();
		System.out.print("Enter second : ");
		String str2=input.next();
		
		if(str1.length() != str2.length())
			System.out.println("not same");
		else {
			int[] arr1= new int[26];
			int[] arr2= new int[26];
			
			for(int i=0; i<str1.length(); i++) {
				arr1[str1.charAt(i)-'a']++;
			}
			for(int i=0; i<str2.length(); i++) {
				arr2[str2.charAt(i)-'a']++;
			}
			boolean check= true;
			
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]!=arr2[i]) {
					check=false;
					break;
				}
			}
			
			if(check)
				System.out.println("same");
			else
				System.out.println("not same");
			
			
		}
		
		
	}

}
