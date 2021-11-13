package Problem;
import java.util.*;
public class p108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("num : ");
		int num= input.nextInt();
		System.out.println( num%3==0 && num%4 !=0);
	}

}
