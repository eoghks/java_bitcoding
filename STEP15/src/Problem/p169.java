package Problem;

public class p169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int a=1; a<=100; a++) {
			for(int b=a; b<=100-a; b++) {
				for(int c=b;c<=100-b-a;c++) {
					if(a+b+c==100)
						count++;
				}
			}
		}
		System.out.println(count);
	}

}
