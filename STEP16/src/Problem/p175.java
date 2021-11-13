package Problem;

public class p175 {
	
	public static int plusA(int a) {
		a++;
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		a=plusA(a);
		a=plusA(a);
		System.out.println(a);
	}

}
