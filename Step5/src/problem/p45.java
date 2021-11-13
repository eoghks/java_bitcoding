package problem;

public class p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A ="NOVEMBER";
		String B= "MAY";
		
		System.out.println(A.indexOf('M'));//4
		System.out.println(A.indexOf('E'));//3
		System.out.println(A.substring(2,5));//VEM
		System.out.println(A.charAt(1));//O
		System.out.println(B.endsWith("y"));//false
		System.out.println(B.toLowerCase());//may
		System.out.println(A+B);//NOBERMBERMAY
	}

}
