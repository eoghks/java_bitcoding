package Problem;

public class p308 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=1; i<=150;i++) {
			for(int j=1; j<=150; j++) {
				for(int k=1; k<=150; k++) {
					if(i*i+j*j==k*k && i+j+k==150) {
						System.out.printf("a : %d, b : %d, c : %d\n", i, j, k);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
