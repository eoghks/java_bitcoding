package Problem;

public class p190 {
	public static String fun_recurring(int num) {
		String result= new String();
		result=Double.toString(1/(double)num);
		result=result.substring(2);
		int L=result.length();
		if(L<=8)
			return "0";
		String temp="";
		for(int i=0; i<L; i++) {
			temp=temp+result.substring(i, i+1);
			int tL=temp.length();
			if(temp.equals(result.substring(tL,2*tL)))
				return temp;
		}
		return "0";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
