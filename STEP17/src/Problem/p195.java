package Problem;

import java.util.Random;

public class p195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		double num=rd.nextDouble();
		num=Math.round(num*1000);
		num=num/100.0;
		System.out.println(num);
	}

}
