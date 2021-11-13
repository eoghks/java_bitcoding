package Problem;

public class p220 {
	public static int fun_arr(int[][] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int e :  arr[i]) {
				if(i>e) {
					sum+= e-i;
				}
				else
					sum-=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1},
				{1,3,5},
				{2,7}
		};
		System.out.println(fun_arr(arr));
	}

}
