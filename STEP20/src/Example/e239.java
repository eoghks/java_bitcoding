package Example;

public class e239 {
	public static int sum1(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return (n+sum1(n-1));
		}
	}
	public static int sum2(int n) {
		int sum=0;
		for(int i=1; i<=n; i++)
			sum+=i;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum1(4));
		System.out.println(sum2(4));
	}

}
