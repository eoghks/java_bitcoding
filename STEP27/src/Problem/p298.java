package Problem;

import java.util.Scanner;

public class p298 {
	public static boolean is_diff(String ABCDEFG) {
		for(int i=0; i<ABCDEFG.length()-1; i++) {
			for(int j=i+1; j<ABCDEFG.length(); j++) {
				if(ABCDEFG.charAt(i)==ABCDEFG.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ABCDE = new String();
		String F= new String();
		String G=new String();
		for(int i=111111; i<1000000; i+=111111) {
			for(int j=1; j<=9; j++) {
				if(i%j==0) {
					G = Integer.toString(i%10);
					F=Integer.toString(j);
					ABCDE=Integer.toString(i/j);
					String ABCDEFG= ABCDE+F+G;
					if(is_diff(ABCDEFG)) {
						System.out.printf("ABCDE : %s, F : %s, GGGGGG : %s => ",ABCDE, F, G+G+G+G+G+G);
						System.out.printf("C : %c, G : %s, C+G=%d\n", ABCDE.charAt(2), G, (Integer.parseInt(G) + (ABCDE.charAt(2)-'0' )));
					}
				}
			}
		}
		
		
		
	}

}
