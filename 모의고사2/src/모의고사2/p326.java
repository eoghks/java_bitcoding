package 모의고사2;

public class p326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] chocolate= {1, 5, 1, 23, 1, 44, 2, 19, 2, 86, 2, 102, 3, 8, 3, 26, 3, 48, 51, 3, 66};
		int[] cake= {1, 6, 1, 46, 1, 54, 2, 57, 2, 87, 3, 13, 3, 25, 3,48, 3, 71};
		for(int i=0; i<chocolate.length; i+=2) {
			for(int j=0; j<cake.length; j+=2) {
				if(chocolate[i]==cake[j]) {
					if(chocolate[i+1]+1==cake[j+1])
						System.out.printf("[%d, %d, %d]\n", chocolate[i], chocolate[i+1], cake[j+1]);
				}
			}
		}
	}

}
