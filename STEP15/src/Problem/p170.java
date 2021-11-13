package Problem;

public class p170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				for(int l=1; l<=3; l++){
					count++;
					if(count==10) {
						System.out.println(100*i+10*j+l);
						break;
					}
				}
			}
		}
	}

}
