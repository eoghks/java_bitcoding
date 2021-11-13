package Example;

public class e291 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100; i++) {
			for(int j=1; j<=i;j++) {
				sum+=j;
			}
		}
		System.out.println(sum);
	}

}
