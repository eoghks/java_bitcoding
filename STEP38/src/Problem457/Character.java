package Problem457;

public class Character {
	String nickName;
	void setNickname(String n) {
		try{
			if(n.length()<4 ||n.length()>16) {
				throw new NicknameLengthException();
		}
		for(int i=0; i<n.length(); i++) {
			int c=(int)n.charAt(i);
			if(!((c>=48 && c<=57 )||(c>=65 && c<=90) || (c>=97 && c<=122) || c==95) )
				throw new IllegalCharException();
		}
			
		this.nickName=n;
	}catch(NicknameLengthException e) {
		System.out.println("닉네임 길이 잘못 설정");
	}catch(IllegalCharException e) {
		System.out.println("잘못된 문자가 포함");
	}
	}
}
