package Problem;

public class p148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total =0;
		for(int i=100; i<=1000; i++) {
			if(i%7==0)
				total +=i;
		}
		System.out.println(total);
	}

}
