package Problem;

public class p165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=11; i++) {
			if(i<=6) {
				for(int j=1; j<=6-i;j++)
					System.out.print(" ");
				for(int j=0; j<2*i-1;j++)
					System.out.print("*");
			}
			else {
				for(int j=0; j<i-6;j++) 
					System.out.print(" ");
				for(int j=0; j<2*(12-i)-1;j++)
					System.out.print("*");
			}
			
			
			
			
			System.out.print("\n");
		}
	}

}
