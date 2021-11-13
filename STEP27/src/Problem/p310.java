package Problem;

public class p310 {
	public static int gauss(double x) {
		if(x<0) {
			return (int)(x+x%1);
		}
		else {
			return (int)(x-x%1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int x=-100; x<=100; x++) {
			if(Math.pow(gauss(x+0.5),2)-3*gauss(x-0.5) -7 ==0)
				count++;
		}
		System.out.println(count);
	}

}
