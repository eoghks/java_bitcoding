package Problem;

public class p304 {
	public static int answer1;
	public static int[] answer2=new int[6];
	public static int count=0;
	
	public static void perm(int[]arr, int pivot) {
		if(pivot==arr.length) {
			count++;
			boolean bdeacf = arr[0]==2&& arr[1] == 4 && arr[2] ==5 && arr[3] == 1 && arr[4] == 3 && arr[5]==6; 
			if(bdeacf)
				answer1 =count;// 1¹ø´ä
			if(count==100) {
				for(int i=0; i<6; i++) {
					answer2[i]=arr[i];
				}
			}
			return;
		}
		
		int[] brr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			brr[i]=arr[i];
		}
		
		for(int i=pivot; i<arr.length; i++) {
			if(i != pivot)
				arr=brr;
			swap(arr,i, pivot);
			if(i!=pivot) {
				for(int j= pivot+1; j<6; j++) {
					for(int k= j+1; k<6; k++) {
						if(arr[j]>arr[k])
							swap(arr,j,k);
					}
				}
			}
			perm(arr, pivot+1);
			swap(arr, i, pivot);
		}
	}
	
	public static void swap(int[]arr, int i, int j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};//a,b,c,d,e,f¼ø
		perm(arr,0);
		System.out.println("answer1 : "+ answer1);
		System.out.print("answer2 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("%c", (char)(answer2[i]+'a'-1));
		}
	}

}
