package Problem;

public class p314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i <=100000;i++) {
			for(int j=2; j<=100000;j++) {
				double A=(2*i -1)/(double)j;
				double B=(2*j-1)/(double)i;
				if(A%1==0 && B%1==0)
					System.out.printf("%d %d\n", i, j);
			}
		}
	}

}
