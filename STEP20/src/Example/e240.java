package Example;

public class e240 {
	public static int cool(int n) {
		if(n==0)
			return 1;
		else if(n%2==0)
			return (cool(n-2)+3);
		else
			return (cool(n-1)*2-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cool(4));
		System.out.println(cool(5));
	}

}
