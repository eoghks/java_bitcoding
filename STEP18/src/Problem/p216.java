package Problem;

public class p216 {
	public static int[] sum_arr(int[] arr1, int[]arr2) {
		int sum=0;
		int length =arr1.length;
		int[] arr = new int[length];
		
		for(int a: arr1) {
			arr[a%length]=sum;
			System.out.printf("%d : %d : ", a, a%length	 );
			for(int b : arr2)
				sum+=a+b;
			System.out.println(sum);
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,5,7,4};
		int[] arr2= {3,1,1,2};
		int[]result= sum_arr(arr1, arr2);
		
		for(int e : result) {
			System.out.printf("%d ",e);
		}
	}

}
