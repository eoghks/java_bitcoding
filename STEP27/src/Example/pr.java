package Example;

public class pr {
	public static void swap(int arr[]) {
		int temp = arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
	public static void swap2(int num1, int num2) {
		int temp= num1;
		num1=num2;
		num2=temp;
	}
	public static int gauss(double x) {
		if(x<0) {
			return (int)(x+x%1);
		}
		else {
			return (int)(x-x%1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[]= {1,2};
		int num1=1;
		int num2=2;
		swap(arr);
		swap2(num1, num2);
		for(int a: arr)
			System.out.println(a);
		
		System.out.println();
		System.out.printf("%d %d",num1,num2);*/
		
		/*double x =-3.10;
		System.out.println(x%1);
		System.out.println((int)x);*/
		String a= "1234";
		System.out.println(a.substring(0, 4)+a.substring(0, 0));
	}

}
