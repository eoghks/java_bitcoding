package Problem;

import java.util.*;

public class p104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("네 수를 입력하세요.");
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		double n3=input.nextDouble();
		double n4=input.nextDouble();
		double average=(n1+n2+n3+n4)/4;
		n1=(n1-average)*(n1-average);
		n2=(n2-average)*(n2-average);
		n3=(n3-average)*(n3-average);
		n4=(n4-average)*(n4-average);
		double std=(n1+n2+n3+n4)/4;
		
		System.out.printf("평균 : %.1f\n분산 : %.1f", average, std);
		input.close();
	}

}
