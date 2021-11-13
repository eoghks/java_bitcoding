package example396;

public class e396 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Account{
	private String name;
	private int balance;
	private String bankName;
	
	int display() {
		return balance;
	}
	
	void deposit(int money) {
		balance+=money;
	}
	
	void withdrawal(int money) {
		if(balance<money) {
			System.out.println("ÀÜ¾× ºÎÁ·");
			return;
		}
		balance-=money;
	}
	
	protected String getName(){
		return name;
	}
	
	public String getBank() {
		return bankName;
	}
}