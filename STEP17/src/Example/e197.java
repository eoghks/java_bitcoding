package Example;

import java.util.Random;

public class e197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd= new Random();
		double rNorm=rd.nextGaussian();
		
		double u=rd.nextDouble();
		double lambda =5.0;
		double rExpo= -Math.log(u) / lambda;
		
		System.out.printf("%f %f ", rNorm,rExpo);
		
	}	

}
