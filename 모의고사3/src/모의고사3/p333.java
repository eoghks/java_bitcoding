package 모의고사3;

import java.util.ArrayList;
import java.util.Scanner;

public class p333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num=input.nextInt();
		int count=0;
		int[] nums=new int[5];
		
		for(int i=num+1; ;i++) {
			ArrayList<Integer> a= new ArrayList<Integer>();
			int j=1;
			while(i>=j) {
				a.add(i/j%10);
				j*=10;
			}
			boolean is_diff= true;
			
			for(int x=0; x<a.size(); x++ ){
				for(int y=x+1; y<a.size(); y++) {
					if(a.get(x)==a.get(y))
						is_diff= false;
				}
					
			}
			
			if(is_diff) {
				nums[count] =i; 
				count++;
			}
				
			
			if(count==5)
				break;
		}
		
		int sum=0;
		for(int a : nums) {
			System.out.printf("%d ",a);
			sum+=a;
		}
		System.out.println();
		System.out.println(sum);
	}

}
