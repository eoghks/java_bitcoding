package example416;

public class smartPhone implements Computer, Phone {
	
	public void internet() {
		System.out.println("���ͳ� ����");
	}

	public void game() {
		System.out.println("���� ����");
	}
	
	public void call(int phoneNo) {
		System.out.println(phoneNo+"���� ��ȭ");
	}
	
	public void text(int phoneNo) {
		System.out.println(phoneNo+"���� ����");
	}
}
