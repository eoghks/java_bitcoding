package Problem;

public class p311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1; x<=20; x++) {
			for(int y=1; y<=20; y++) {
				for(int z=1; z<=20; z++) {
					if(x+y==30&&Math.pow(x, 2)+y-z==100)
						System.out.printf("x: %d, y: %d, z : %d\n", x, y, z);
				}
			}
		}
	}

}
