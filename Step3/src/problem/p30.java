package problem;

public class p30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=2, c=3;
		a+=b++ +c;//a=6 b=3
		b+=++b +c;//b=10
		c+= c++ + ++c;// 3+4 +4 11
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
