package Problem;

public class p213 {
	public static int sum_arr(int[] arr1, int[] arr2) {
		int sum=0;
		for(int a:arr1) {
			for(int b: arr2) {
				if(a>b) {
					sum+=b;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,5,2,4};
		int[] arr2= {3,1,1};
		int result =sum_arr(arr1, arr2);
		System.out.println(result);
	}

}
