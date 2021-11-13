package Problem;

import java.util.Random;

public class p211 {
	public static int maxValue(int[] arr) {
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int minValue(int[] arr) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int[] arr= new int[8];
		for(int i=0; i<arr.length; i++) {
			arr[i]=rd.nextInt(20);
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		int max=maxValue(arr);
		int min=minValue(arr);
		System.out.printf("max : %d, min : %d\n", max, min);
	}

}
