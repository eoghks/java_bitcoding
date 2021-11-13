package Problem;

import java.util.Calendar;
import java.util.Scanner;

public class p278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Calendar ca1= Calendar.getInstance();//첫번째 사람 생일
		Calendar ca2= Calendar.getInstance();//두번째 사람 생일
		
		System.out.print("첫번재 사람 생일 : ");
		String person1=input.nextLine();
		System.out.print("두번째 사람 생일 :");
		String person2=input.nextLine();
		
		String[] arr1=person1.split("/");
		String[] arr2=person2.split("/");
		int[] data1= new int[3];
		int[] data2= new int [3];
		for(int i=0; i<3; i++) {
			data1[i]=Integer.parseInt(arr1[i]);
			data2[i]=Integer.parseInt(arr2[i]);
		}
		
		ca1.set(data1[0], data1[1]-1, data1[2]);
		ca2.set(data2[0], data2[1]-1, data2[2]);
		
		long diff= Math.abs(ca1.getTimeInMillis()-ca2.getTimeInMillis());
		diff = diff /(1000*3600*24);
		System.out.println(diff);
		
	}

}
