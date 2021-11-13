package Problem;

public class p295 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				for(int k=j; k<=5; k++) {
					System.out.printf("[%d, %d, %d]\n",i,j,k);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
