package Problem;

public class p167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(3*i+2*j==10)
					System.out.printf("x = %d, y = %d\n", i, j);
			}
		}
	}

}
