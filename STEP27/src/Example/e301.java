package Example;

import java.util.ArrayList;

public class e301 {
	public static void Comb(int n, ArrayList<Integer> a, int toPick) {
		if(toPick==0) {
			System.out.println(a.toString());
			return;
		}
		int smallest;
		if(a.isEmpty()) {
			 smallest =1;
		}
		else {
			 smallest = a.get(a.size()-1)+1;
		}
		
		for(int next= smallest ; next<=n; next++) {
			a.add(next);
			Comb(n, a, toPick-1);//new로 만드는이유가 무엇일까?
			a.remove(a.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		Comb(5,a,4);
	}

}
