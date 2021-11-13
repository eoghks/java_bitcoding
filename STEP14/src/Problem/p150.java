package Problem;

public class p150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int num =2018;num>0;) {
			sum+=num&10;
			num=num&(num-10);
		}
		System.out.println(sum);
	}

}
