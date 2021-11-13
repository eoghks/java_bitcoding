package 모의고사4;

import java.util.Scanner;

public class p345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the grade : ");
		String str=input.next();
		int score =0;
		String[] OX=str.split("X");
		for(int i=0; i<OX.length; i++) {
			for(int j=0; j<OX[i].length(); j++) {
				score+=(j+1);
			}
		}
		
		System.out.println("score : "+score);
	}

}
