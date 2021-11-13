package Problem;

public class p156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		for(; ;i++) {
			if(i%2!=0)
				sum+= i*(i+1);
			else
				sum-= i*(i+1);
			System.out.printf("%d %d\n", sum, i);
			if(sum>=100) {
				break;
			}
				
		}
		System.out.println(i);
	}

}
