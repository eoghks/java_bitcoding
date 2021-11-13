package Example444;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList= {2,3,6,0};
		try {
			Calculator.divide(myList, 5, 0);
		}catch(Exception e) {
			System.out.println("Exception 발생");
		}
		try {
			Calculator.divide(myList, 2, 0);
		}catch(Exception e) {
			System.out.println("Exception 발생");
		}
	}

}
