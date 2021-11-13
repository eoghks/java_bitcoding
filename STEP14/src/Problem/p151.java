package Problem;

public class p151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		int j=1;
		for(int num=2018; num>0;) {
			if(num%10==2)
				sum+=(num/10)*i+(j+1);
			else if(num %10 >2)
				sum+=(num/10+1)*i;
			else
				sum+=(num/10)*i;
			j+=i*(num%10);
			i+=2;
			num/=10;
		}
		
		System.out.println(sum);
	}

}
