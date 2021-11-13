package Problem456;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList();
		a.add("first");
		a.add(null);
		a.add("");
		MyStringArray ms= new MyStringArray();
		
		ms.calc(a, 2, 5);
		ms.calc(a, 0, 1);
		
		try {
			ms.calc(a, 0, 2);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
