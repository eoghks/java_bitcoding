package Example;

public class e218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,2},
				{3,4,5},
				{6}
		};
		for(int i=0; i<arr.length; i++) {
			for(int a : arr[i])
				System.out.printf("%d ",a);
			System.out.println();
		}
	}

}
