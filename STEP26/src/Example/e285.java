package Example;

import java.util.ArrayList;

public class e285 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("Hello");
		a.add(new Integer(3));
		a.add(4);
		a.add(1, 3.14);
		for(int i=0; i<a.size(); i++)
			System.out.println(a.get(i));
	}

}
