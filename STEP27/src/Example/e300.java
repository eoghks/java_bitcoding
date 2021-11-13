package Example;

public class e300 {
	public static void perm(int[] arr, int pivot) {
		if(arr.length==pivot) {
			print(arr);
			return;
		}
		for(int i=0; i<arr.length; i++) {
			swap(arr, i, pivot);
			perm(arr, pivot+1);
			swap(arr, i, pivot);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				System.out.println(arr[i]);
			else
				System.out.print(arr[i]+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4};
		perm(arr1,0);
	}

}
