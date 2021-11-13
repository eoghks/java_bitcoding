package Problem;

public class p294 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j)
					continue;
				for(int k=1; k<=5; k++) {
					if(j==k || i==k)
						continue;
					System.out.printf("[%d, %d, %d]\n",i,j,k);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
