package Problem;
import java.util.*;
public class p118_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String str=input.nextLine();
		str.replace(" ", "");
		int n=0;
		int sum=0;
		while(n< str.length()-3) {
			sum+=Integer.parseInt(str.substring(n, n+3));
			n+=3;
		}
		
		sum+=Integer.parseInt(str.substring(n,str.length()));
		System.out.println(sum);
	}

}
