package Example;

public class e293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1; i<=3; i++) {
			for(int j=i+1; j<=4; j++) {
				for(int k=j+1; k<=5; k++) {
					System.out.printf("%d %d %d\n",i,j,k);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
