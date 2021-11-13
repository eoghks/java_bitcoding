package Problem;
import java.util.*;
public class p112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num = input.nextInt();
		num= num*4;
		String Binary_num=Integer.toBinaryString(num);
		System.out.println(Binary_num);
		input.close();
	}

}
