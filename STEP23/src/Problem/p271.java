package Problem;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca =Calendar.getInstance();
		ca.set(3000, 2, 25);	
		SimpleDateFormat sd =new SimpleDateFormat("yyyy�� MM�� dd�� w�� E����");
		System.out.println(sd.format(ca.getTime()));
		
		
		
		
		}

}
