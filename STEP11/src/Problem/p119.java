package Problem;
import java.util.*;
public class p119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number : ");
		int num =input.nextInt();
		if(num%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		input.close();
	}

}
