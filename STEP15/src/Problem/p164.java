package Problem;

public class p164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=11; i++) {
			for(int j=0; j<11-i; j++)
				System.out.print(" ");
			for(int j=0; j<2* i-1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}
