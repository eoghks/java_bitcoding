package Example;

public class e217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1= new int[2][3];
		int[][] arr2= {
				{1,2,3},
				{4,5,6}				
		};
		int[][] arr3= {
				{1},
				{2,3},
				{4,5,6}
		};
		System.out.println(arr3[1][0]);
		/*for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				System.out.printf("%d ",arr3[i][j]);
			}
			System.out.println();
		}*/
	}

}
