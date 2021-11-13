package Problem;
import java.util.*;
public class p115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		char ch='A';
		char ch2='a';
		int num= input.nextInt();
		ch=(char) (ch+num-1);
		ch2=(char)(ch2+num-1);
		System.out.println(ch+" "+ch2);
	}

}
