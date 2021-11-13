package Problem;

public class p107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=1, B=3, C=5, D=7;
		//System.out.println(A-2*A);//-1
		//System.out.println(A+B%C);//4
		System.out.println(++A * A - D);//2*2-7
		System.out.println((B++) - ++B);//3 - 5 =-2
		//System.out.println(++( B + C ) - B);
		System.out.println( --B - B + (++B));//4 -4 +5 =5
		System.out.println((A++) + ++A * ++A);//2+4*5=22
	}

}
