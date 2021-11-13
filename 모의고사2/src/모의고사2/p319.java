package 모의고사2;

public class p319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {12, 23, 48, 42, 32, 50, 72, 34, 19, 74, 60, 40, 94};
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=numbers[i]%24;
		}
		int count=0;
		for(int i=0; i<numbers.length; i++) {
			System.out.printf("%d ", numbers[i]);
			boolean is_Solo= true;
			for(int j=0; j<i; j++) {
				if(numbers[i]==numbers[j])
					is_Solo=false;
			}
			
			if(is_Solo)
				count++;
		}
		System.out.println();
		System.out.println(count);
	}
	

}
