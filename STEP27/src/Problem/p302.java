package Problem;

public class p302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int[6*6*6*6][4];
		int[] dice = {1,2,3,4,5,5};
		int index =0;
		for(int i : dice) {
			for(int j: dice) {
				for(int k  : dice) {
					for(int l : dice) {
						arr[index][0]=i;
						arr[index][1]=j;
						arr[index][2]=k;
						arr[index][3]=l;
						index++;
					}
				}
			}
		}
		
		int count =0;
		int[] count_1=new int[5];
		
		for(int i=0; i<6*6*6*6; i++) {
			count =0;
			for(int j=0;j<4; j++) {
				if(arr[i][j]==1)
					count++;
			}
			count_1[count]++;
		}
		
		for(int i=0; i<count_1.length; i++) {
			System.out.printf("%dȸ : %d\n", i, count_1[i]);
		}
		
	}

}
