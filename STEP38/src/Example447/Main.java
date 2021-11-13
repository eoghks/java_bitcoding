package Example447;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList= {2,3,6,4};
		try {
			Calculator.divide(myList, 5, 0);
		}catch (Exception e) {
			System.out.println("***");
			System.out.println(e.getMessage());
			System.out.println("***");
			System.out.println(e.toString());
			System.out.println("***");
			e.printStackTrace();
		}
	}

}
