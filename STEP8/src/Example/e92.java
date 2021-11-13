package Example;

public class e92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=289;
		String str_i=Integer.toString(i1);
		int i2= Integer.parseInt(str_i);
		System.out.printf("%d %d %s \n", i1, i2, str_i);
		
		double d1=35.632;
		String str_d= Double.toString(d1);
		double d2=Double.parseDouble(str_d);
		double d3=Double.valueOf(str_d).doubleValue();
		System.out.printf("%f %f %f %s \n", d1, d2, d3, str_d);
	}

}
