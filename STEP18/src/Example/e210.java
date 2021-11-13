package Example;

public class e210 {
	public static int sum_arr(int[] arr) {
		int sum=0;
		for(int a:arr)
			sum+=a;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		System.out.println(sum_arr(arr));
	}

}
