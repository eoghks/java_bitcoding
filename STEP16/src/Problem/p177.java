package Problem;

import java.util.Scanner;

public class p177 {
	public static char CHECK_GRADE(int score) {
		if(score<=100 && score>=90)
			return ('A');
		else if(score>=80)
			return ('B');
		else if(score>=70)
			return ('C');
		else if(score>=60)
			return ('D');
		else
			return ('F');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Score : ");
		int score=input.nextInt();
		char grade=CHECK_GRADE(score);
		System.out.println(grade);
	}

}
