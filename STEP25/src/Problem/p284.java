package Problem;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca=Calendar.getInstance();
		SimpleDateFormat sd= new SimpleDateFormat("ddE");//���� �����
		SimpleDateFormat sd2= new SimpleDateFormat("yyyy�� MM�� dd�� w�� E����");
		for(int i=2000; i<=2100; i++) {
			for(int j=1; j<=12; j++) {
				for(int k=1; k<=13;k++) {
					ca.set(i, j-1, k);
					if(sd.format(ca.getTime()).equals("13��"))
						System.out.println(sd2.format(ca.getTime()));
				}
			}
		}
	}

}
