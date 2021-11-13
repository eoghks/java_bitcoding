package Problem;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca =Calendar.getInstance();
		ca.set(3000, 2, 25);	
		SimpleDateFormat sd =new SimpleDateFormat("yyyy년 MM월 dd일 w주 E요일");
		System.out.println(sd.format(ca.getTime()));
		
		
		
		
		}

}
