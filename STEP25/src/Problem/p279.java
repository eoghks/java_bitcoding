package Problem;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca =Calendar.getInstance();
		SimpleDateFormat sd1 =new SimpleDateFormat("WE");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy�� MM�� dd�� w�� E����");
		for(int i=0; i<12; i++) {
			for(int j=1; j<=14; j++) {
				ca.set(2018,  i, j);
				if(sd1.format(ca.getTime()).equals("2ȭ"))
					System.out.println(sd2.format(ca.getTime()));
			}
		}
	}

}
