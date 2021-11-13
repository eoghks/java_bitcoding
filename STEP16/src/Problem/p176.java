package Problem;

public class p176 {

	public static int plusAB(int a, int b) {
		a++; b++;
		return ++a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		int b =1;
		a=plusAB(a,b);
		a=plusAB(a,b);
		System.out.println(a);
	}

}
