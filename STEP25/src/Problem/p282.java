package Problem;

import java.util.Scanner;

public class p282 {
	public static boolean is_number(char ch) {
		char[] numbers= {'0','1','2','3','4','5','6','7','8','9'};
		for(char e : numbers) {
			if(ch== e)
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str =input.nextLine();
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			if(is_number(str.charAt(i))&&str.charAt(i)!='0') {
				int j=i;
				for(; j<str.length(); j++) {
					if(!is_number(str.charAt(j)))
						break;
				}
				sum+=Integer.parseInt(str.substring(i,j));
				i=j-1;
			}
		}
		System.out.println(sum);
	}

}
