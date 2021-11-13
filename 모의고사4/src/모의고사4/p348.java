package 모의고사4;

import java.util.ArrayList;

public class p348 {
	public static int count=0;
	public static void tour(int start, ArrayList<Integer> a, int[][] subway) {
		a.add(start);
		if(a.size()==6)
			return;
		int min=100;
		for(int i=0; i<6; i++) {
			if(a.contains(i)) {
				continue;
			}
			if(min>subway[start][i]) {
				min=subway[start][i];
			}
		}
		int index =0;
		for(int i=0; i<6; i++){
			if(min==subway[start][i])
				index=i;
		}
		
		tour(index , a, subway);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] subway= {{0, 10, 23, 7 ,4, 16},//0,1,2,3,4,5
				    {10, 0, 8, 5, 13, 10},
				    {23, 8, 0, 19, 8 ,11},
				    {7, 5, 19, 0, 15, 8},
				    {4, 13, 8, 15, 0, 2},
				    {16, 10, 11, 8, 2, 0}};
		
		ArrayList<Integer> a=new ArrayList<Integer>();//min
		int min_sum=1000000;
		
		for(int i=0; i<6; i++) {
			ArrayList<Integer> b=new ArrayList<Integer>();
			tour(i, b, subway);
			int sum=0;
		
			for(int j=0; j<b.size()-1; j++) {
				sum+=subway[b.get(j)][b.get(j+1)];
			}//sum 계산
			if(min_sum>sum) {
				a=b;
				min_sum=sum;
			}
		}
		
		
		for(int i=0; i<a.size(); i++) {
			if(i==a.size()-1)
				System.out.printf("%d\n", a.get(i));
			else
				System.out.printf("%d -> ", a.get(i));
		}
		
		System.out.println(min_sum);
	}

}
