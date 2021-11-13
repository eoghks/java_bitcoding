package Example;
import java.text.SimpleDateFormat;
import java.util.*;
public class e268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now= Calendar.getInstance();
		SimpleDateFormat sd= new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
		System.out.println(sd.format(now.getTime()));
	}

}
