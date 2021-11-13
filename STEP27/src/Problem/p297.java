package Problem;

import java.util.ArrayList;

public class p297 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=0; i<11; i++) {
			if(i<2) {//1¿ù
				a.add(2);
			}	
			else if(i==2) {
				a.add(2*a.get(i-2));
			}
			else {
				a.add(a.get(i-1)+a.get(i-2));
			}
		}
		
		System.out.println(a.get(10));
	
	}
}
