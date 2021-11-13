package Problem;


public class p185 {
	
	public static  boolean ismulThree(int n) {
		return (n%3==0? true : false);
	}
	
	public static  boolean ismulFive(int n) {
		return (n%5==0? true : false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		for(int i=1; i<100000;i++) {
			if(ismulThree(i)||ismulFive(i))
				sum+=i;
		}
		System.out.println(sum);
	}

}
