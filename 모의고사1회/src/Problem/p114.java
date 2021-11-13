package Problem;

public class p114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ABCDEFGH";
		System.out.println(str.charAt(5));
		System.out.println(str.substring(6));
		System.out.println(str.replace("B", "").substring(0,3));
		System.out.println(str.substring(0,6));
		System.out.println(str.charAt(7)+str.substring(6)+str.charAt(5));
	}

}
