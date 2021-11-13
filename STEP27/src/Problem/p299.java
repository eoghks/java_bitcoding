package Problem;

public class p299 {
	public static boolean is_bit(int number) {
		boolean first = false;
		boolean second = false;
		for(int i=1; i<=9; i++) {
			if(number%i==0 && number/i>=100 && number/i<=999) {
				first= true;
				break;
			}
		}
		
		for(int i=10; i<=99; i++) {
			if(number%i==0 && number/i>=10 && number/i<=99) {
				second= true;
				break;
			}
		}
		
		return (first&&second);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=100;
		for(int i=100; i<10000; i++) {
			if(is_bit(i))
				max=i;
		}
		System.out.println(max);
		
	}

}
