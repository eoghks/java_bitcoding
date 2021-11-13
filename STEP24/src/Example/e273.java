package Example;

public class e273 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Motors="Hyundai,Kia,BMW,Bentz";
		String[] arr=Motors.split(",");
		for(String e: arr)
			System.out.println(e);
		System.out.println();
		
		String str_M=String.join("-", arr);
		System.out.println(str_M);
	}

}
