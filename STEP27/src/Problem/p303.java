package Problem;

public class p303 {
	public static int count =0;
	
	public static void perm(int[] arr, int pivot) {
		if(pivot==arr.length) {
			count++;
			return;
		}
		
		for(int i=pivot; i<arr.length; i++) {
			if(i==0 &&pivot==0)
				continue;
			swap(arr, i, pivot);
			perm(arr, pivot+1);
			swap(arr,i, pivot);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5};
		perm(arr, 0);
		System.out.println(count);
	}

}
