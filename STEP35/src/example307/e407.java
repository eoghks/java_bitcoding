package example307;

public class e407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class BaseballPlayer{
	String name;
	String getName() {
		return this.name;
	}
	abstract void training();
}

class Batter extends BaseballPlayer{
	int battingAbility;
	void training() {
		this.battingAbility++;
		System.out.println("Ÿ�� �Ʒ� �Ϸ�");
	}
}

class Pitcher extends BaseballPlayer{
	int pitchingAbility;
	void training() {
		this.pitchingAbility++;
		System.out.println("���� �Ʒ� �Ϸ� ");
	}
}