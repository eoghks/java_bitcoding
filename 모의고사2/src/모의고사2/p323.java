package 모의고사2;

public class p323 {
	public static int[][] sumMatrix(int[][] A, int[][] B){
		int[][] C= new int[2][2];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		
		return C;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2},{2,3}};
		int[][] B= {{3,4},{5,6}};
		
		int[][] C=sumMatrix(A, B);
		
		for(int[] e : C) {
			for(int f : e)
				System.out.printf("%d ",f);
			System.out.println();
		}
		
		
	}

}
