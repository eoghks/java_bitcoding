package Problem;
import java.util.*;
public class p117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		String BinaryNum=Integer.toBinaryString(n);
		char ch1=BinaryNum.charAt((BinaryNum.length()-2));
		char ch2=BinaryNum.charAt((BinaryNum.length()-5));
		System.out.println(ch1+" "+ch2);
	}

}
