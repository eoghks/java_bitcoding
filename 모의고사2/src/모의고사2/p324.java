package 모의고사2;

public class p324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =2018; 
		int i=1;
		int sum=0; 
		int a=0;
		
		while(n>0) {
			if(n%10==3)
				sum+=(n/10) *i +(a+i);
			else if(n%10>3)
				sum+=(n/10+1)*i;
			else
				sum+=(n/10)*i;
			
			a+=i*(n%10);
			i*=10;
			n/=10;
		}
		System.out.println(sum);
	}

}
