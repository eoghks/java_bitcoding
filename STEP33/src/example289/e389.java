package example289;

public class e389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e389_2 ex= new e389_2();
		ex.defMethod();
		ex.protMethod();
		ex.pubMethod();
		//ex.privMethod(); ���� : private�ε� ���� �ٸ� Ŭ���� 
		e389 ex2= new e389();
		ex2.privlnnerMethod();
	}
	private void privlnnerMethod() {
		System.out.println("this is inner private!");
	}
}


protected class e389_2{
	private void privMethod() {
		System.out.println("this is private!");
	}
	
	void defMethod() {
		System.out.println("this is defaulst!");
	}
	
	protected void protMethod() {
		System.out.println("this is protected!");
	}
	
	public void pubMethod() {
		System.out.println("thie is public");
	}

	
	private void privlnnerMethod() {
		System.out.println("this is inner private!");
	}
}
