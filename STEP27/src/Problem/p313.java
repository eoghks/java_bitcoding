package Problem;

public class p313 {
	public static boolean DF(int num) {
		int n=1;
		int sum=0;
		while(num>=n) {
			sum+=fac(num/n%10);
			n*=10;
		}
		System.out.println(num+" "+ sum);
		if(sum==num)
			return true;
		return false;
	}
	
	public static int fac(int n) {
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else
			return n*fac(n-1);
	}
	
	public static boolean DTP(int num) {
		int n=1;
		int sum=0;
		while(num>=n) {
			int i=num/n%10;
			sum+=i*i*i;
			n*=10;
		}
		if(sum==num)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int DF_count=0;
		int DTP_count=0;
		for(int i=1; i<=1000; i++) {
			boolean DF_is = DF(i);
			boolean DTP_is = DTP(i);
			if(DF_is)
				DF_count++;
			if(DTP_is)
				DTP_count++;
		}
		System.out.println(DF_count +" "+ DTP_count);
		int diff= Math.abs(DTP_count - DF_count);
		System.out.println(diff);
	}

}
