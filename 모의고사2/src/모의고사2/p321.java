package ���ǰ��2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class p321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Calendar a=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("E����");
		
		System.out.print("x��? : ");
		int x=input.nextInt();
		System.out.print("y��? : ");
		int y=input.nextInt();
		
		a.set(2018, x-1, y);
		System.out.println(sd.format(a.getTime()));
	}

}
