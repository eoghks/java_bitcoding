package example416;

public class smartPhone implements Computer, Phone {
	
	public void internet() {
		System.out.println("인터넷 접속");
	}

	public void game() {
		System.out.println("게임 실행");
	}
	
	public void call(int phoneNo) {
		System.out.println(phoneNo+"에게 전화");
	}
	
	public void text(int phoneNo) {
		System.out.println(phoneNo+"에게 문자");
	}
}
