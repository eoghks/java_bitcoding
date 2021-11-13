package Problem;

public class p207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4};
		int[] arr2= {8,7,6,5};
		int[] arr3= new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=arr1[i]+arr2[i];
			System.out.println(arr3[i]);
		}
	}

}
