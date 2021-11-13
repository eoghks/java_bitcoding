package Problem;
import java.util.*;
public class p110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=input.nextInt();
		
		String Binary_num=Integer.toBinaryString(num);
		System.out.println(num+"의 2진수 표현은"+Binary_num);
		input.close();
	}

}
