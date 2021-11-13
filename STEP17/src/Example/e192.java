package Example;
import java.util.Random;
public class e192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd= new Random();
		int var1= rd.nextInt();
		boolean var2=rd.nextBoolean();
		double var3= rd.nextDouble();
		
		System.out.printf("%d %b %f\n", var1, var2, var3);
	}

}
