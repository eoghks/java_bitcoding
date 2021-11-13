package Problem;
import java.util.*;
public class p127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String str=input.nextLine();
		str=str.toUpperCase();
		char ch=str.charAt(0);
		if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("Good Sentence");
		input.close();
	}

}
