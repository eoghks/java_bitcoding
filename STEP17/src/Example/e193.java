package Example;
import java.util.*;
public class e193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd= new Random();
		Scanner input=new Scanner(System.in);
		
		int answer=rd.nextInt(10);
		int num=0;
		do {
			System.out.printf("10������ ���� ���߼��� : ");
			num= input.nextInt();
		}while(num!=answer);
		System.out.println("���߼˽��ϴ�.");
	}

}
