package Problem;

public class p315 {
	public static boolean is_prime(int n) {
		if(n<2)
			return false;
		for(int i=2; i<n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean cir_pnum(int n) {
		String num= Integer.toString(n);
		int size= num.length();
		for(int i=0; i<size; i++) {
			num= num.substring(i,size)+num.substring(0, i);
			if(!is_prime(Integer.parseInt(num)))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100000; i++) {
			if(cir_pnum(i))
				sum+=i;
		}
		System.out.println(sum);
	}

}
