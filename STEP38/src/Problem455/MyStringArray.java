package Problem455;
import java.util.*;
public class MyStringArray {
	static void calc(ArrayList<String> as, int a, int b) {
		String first= "";
		String second ="";
		int firstLength=0;
		int secondLength=0;
		try {
			first=as.get(a);
			second=as.get(b);
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		try {
			firstLength=first.length();
			secondLength=second.length();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		try {
			System.out.println(firstLength/secondLength);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}
