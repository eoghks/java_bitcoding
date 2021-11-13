package 모의고사2;

public class p330 {
	public static int count =0;
	public static void perm(int[] arr, int pivot) {
		if(pivot==arr.length) {
			boolean BC= true;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]==1 && arr[i+1]==1)
					BC=false;
				else if(arr[i]==2 && arr[i+1]==2)
					BC=false;
			}
			if(BC)
				count++;
			return;
		}
		for(int i= pivot; i<arr.length; i++) {
			swap(arr, i, pivot);
			perm(arr, pivot+1);
			swap(arr, i, pivot);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,0,0,0,0,1,1,1,2,2};// A반 =0, B반=1, C반= 2
		perm(arr, 0);
		System.out.println(count);
	}

}
