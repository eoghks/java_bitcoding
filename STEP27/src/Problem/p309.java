package Problem;

public class p309 {
	public static int gauss(double x) {
		if(x<0) {
			return (int)(x+x%1);
		}
		else {
			return (int)(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=-99; i<200; i++) {
			double x = i/100.0;
			if(2*x*x-(x + 3*gauss(x)) ==0)
				System.out.println(x);
		}
	}

}
