package Problem;
import java.util.*;
public class p120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.printf("Enter the number : ");
		int num =input.nextInt();
		num=num/10000;
		int cur=2018-65+1-1900;
		if(num<=cur && num>18) {
			System.out.println("old");
		}
		input.close();
	}

}
