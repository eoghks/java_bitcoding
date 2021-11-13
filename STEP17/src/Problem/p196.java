package Problem;

import java.util.Random;

public class p196 {
	public static int evenNum(Random rd) {
		int num=rd.nextInt(50)*2;
		return num;
	}
	public static int oddNum(Random rd) {
		int num=(rd.nextInt(49)*2)+1;
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int even_num=evenNum(rd);
		int odd_num=oddNum(rd);
		System.out.printf("odd : %d, even : %d \n", odd_num, even_num);
	}

}
