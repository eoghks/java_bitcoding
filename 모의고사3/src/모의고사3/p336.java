package 모의고사3;

public class p336 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=7; i++) {
			for(int j=0; j<=7; j++) {
				if(i*10+j+j*10+i==77)
					System.out.printf("A : %d, B : %d\n", i, j);
			}
		}
	}

}
