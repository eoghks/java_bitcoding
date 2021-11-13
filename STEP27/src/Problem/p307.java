package Problem;

public class p307 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dice= {1,2,3,4};
		int total=0;
		int count =0;
		int case_1=0;
		for(int i : dice) {
			for(int j : dice) {
				for(int k : dice) {
					for(int n: dice) {
						for(int m : dice) {
							total++;
							case_1=0;
							int[] arr= {0,0,0,0};
							int[] num= {i,j,k,n,m};
							for(int a : num) {
								if(arr[a-1]==0)
									arr[a-1]=1;
								else
									arr[a-1]=0;
							}
							for(int a : arr) {
								if(a==1)
									case_1++;
							}
							if(case_1==1)
								count++;
						}
					}
				}
			}
		}
		System.out.printf("total : %d, count : %d, È®·ü : %f", total, count, (double)count/total);
	}

}
