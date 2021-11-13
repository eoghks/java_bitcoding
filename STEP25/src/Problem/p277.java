package Problem;
import java.text.SimpleDateFormat;
import java.util.*;
public class p277 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca =Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("Eø‰¿œ");
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the year/month/day : ");
		String str=input.next();
		String[] arr=str.split("/");
		
		int year=Integer.parseInt(arr[0]);
		int month=Integer.parseInt(arr[1]);
		int day=Integer.parseInt(arr[2]);
		
		
		ca.set(year, month-1, day);
		System.out.println(str+"¿∫ "+sd.format(ca.getTime()));
		
		
	}

}
