package Problem;
import java.util.*;
public class p135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		switch(num%3) {
		case 0 : System.out.print(num+3);
		break;
		default : System.out.print(num%3);
		}
	}

}
