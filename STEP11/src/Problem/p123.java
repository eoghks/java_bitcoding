package Problem;

public class p123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=53;
		if(num<=60) {
			if(num<=30)
				num+=--num/2-30;
			else
				num-= --num/2+30;
		}
		System.out.print(num);
	}

}
