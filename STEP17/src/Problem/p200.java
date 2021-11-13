package Problem;

import java.util.Random;
import java.util.Scanner;

public class p200 {

	public static boolean level1() {
		Random rd=new Random();
		Scanner input= new Scanner(System.in);
		int answer=rd.nextInt(2)+1;
		System.out.print("level1 (1~2) : ");
		int result =input.nextInt();
		if(result==answer)
			return true;
		System.out.println("Failure!");
		System.out.println("Answer is : "+answer);
		return false;
	}
	
	public static boolean level2() {
		Random rd=new Random();
		Scanner input= new Scanner(System.in);
		int answer=rd.nextInt(4)+1;
		System.out.print("level1 (1~4) : ");
		int result =input.nextInt();
		if(result==answer)
			return true;
		System.out.println("Failure!");
		System.out.println("Answer is : "+answer);
		return false;
	}
	
	public static boolean level3() {
		Random rd=new Random();
		Scanner input= new Scanner(System.in);
		int answer=rd.nextInt(8)+1;
		System.out.print("level1 (1~8) : ");
		int result =input.nextInt();
		if(result==answer)
			return true;
		System.out.println("Failure!");
		System.out.println("Answer is : "+answer);
		return false;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(level1()) {
			if(level2()) {
				if(level3()) {
					System.out.println("Lucky");
				}
			}
		}
	}

}
