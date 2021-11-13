package Promblem;

import java.util.ArrayList;

public class p290 {
	public static ArrayList<Integer> fun(ArrayList<Integer> a){
		int sum=0;
		int max=a.get(0);
		int index_max=0;
		for(int i=0; i<a.size(); i++) {
			sum+=a.get(i);
			if(max<a.get(i)) {
				max=a.get(i);
				index_max=i;
			}
		}
		a.remove(index_max);
		a.add(a.size()/2,sum-max);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(6);
		a=fun(a);
		a.add(5);
		a.add(5);
		a=fun(a);
		System.out.println(a.toString());
	}

}
