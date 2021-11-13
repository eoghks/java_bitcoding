package Example;

public class e275 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str= new StringBuffer("ABCDEFGH");
		System.out.println(str);
		System.out.println(str.append("IJKL"));
		System.out.println(str.delete(0, 4));
		System.out.println(str.deleteCharAt(4));
	}

}
