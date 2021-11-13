package Problem;

public class p305 {
	public static int count =0;
	public static void perm(int[] arr, int pivot) {
		if(pivot==arr.length) {
			boolean is_t= true;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]+arr[i+1]==0)
					is_t=false;
			}
			if(is_t)
				count++;
			return;
		}
		for(int i= pivot; i<arr.length; i++) {
			swap(arr,i,pivot);
			perm(arr, pivot+1);
			swap(arr,i,pivot);
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 1, 1, 1, 0, 0, 0};
		perm(arr,0);
		System.out.println(count);
	}

}
