package Problem;

public class p306 {
	public static int count =0;
	public static void swap(char[] arr, int i, int j) {
		char temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void perm(char[] arr, int pivot) {
		if(arr.length == pivot) {
			int indexOf_c = 0;
			int indexOf_n = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]=='c')
					indexOf_c = i;
				if(arr[i]=='n')
					indexOf_n =i;
			}
			if(indexOf_c < indexOf_n)
				count++;
			return;
		}
		
		for(int i=pivot; i<arr.length; i++) {
			swap(arr, i, pivot);
			perm(arr, pivot+1);
			swap(arr, i, pivot);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'c','o','d','i','n','g'};
		perm(arr, 0);
		System.out.println(count);
	}

}
