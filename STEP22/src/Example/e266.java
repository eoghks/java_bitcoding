package Example;
import java.util.Calendar;
public class e266 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now=Calendar.getInstance();
		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println(now.getTimeInMillis());
		now.set(2018,3, 13);
		System.out.println(now.getTime());
	}	

}
