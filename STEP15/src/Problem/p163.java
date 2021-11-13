package Problem;

public class p163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=11; i++) {
			if(i*2-1<11) {
				for(int j=0; j<i*2-1; j++)
					System.out.print("*");
			}
			else {
				for(int j=0; j<11; j++)
					System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
