package Problem;

import java.io.IOException;

public class p124 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch=(char)System.in.read();
		if(ch=='A'||ch=='B') {
			System.out.println("참 잘했습니다.");
		}
		else if(ch=='C' || ch=='D') {
			System.out.println("좀 더 노력해보세요.");
		}
		else if(ch=='F') {
			System.out.println("다음 학기에 다시 수강하세요.");
		}
		
	}

}
