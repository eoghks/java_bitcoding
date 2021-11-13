package 모의고사3;

public class p331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2=new int [3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr2[(i+1)%3][j]=arr1[i][j];
			}
		}
		
		for(int[] e : arr2) {
			for(int a : e) {
				System.out.printf("%d ", a);
			}
			System.out.println();
		}
	}

}
