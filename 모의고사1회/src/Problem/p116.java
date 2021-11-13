package Problem;
import java.util.*;
public class p116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("다섯자리 정수 n :");
		int n= input.nextInt();
		int a=n/10000;
		int b=n%100/10;
		System.out.printf("%d \n",a* b);
	}

}
