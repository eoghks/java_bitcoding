package Problem;

public class p142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		do {
			if(num>=100) {
				System.out.println(100);
				break;
			}
			num*=2;
			System.out.println(num++);
		}while(num>=2);
	}

}
