package Example;

public class e219 {
	public static int sum_arr(int[][] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int a : arr[i]) {
				sum+=a;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {
				{1,2}, {3,4,5}, {6}
		};
		System.out.println(sum_arr(arr));
	}

}
