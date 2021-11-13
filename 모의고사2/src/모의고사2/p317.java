package 모의고사2;

public class p317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int[3][3];
		int sum=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum+=Math.abs(i-j);
				arr[i][j]=sum;
			}
		}
		
		for(int[] e : arr) {
			for(int a : e) {
				System.out.printf("%d ", a);
			}
			System.out.println();
		}
	}

}
