package Example446;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person("Jason");
		try {
			p.setAge(-5);
		}catch(NegativeAgeException e) {
			System.out.println("음수로 설정 불가");
		}
	}

}
