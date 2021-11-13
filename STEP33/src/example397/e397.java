package example397;

public class e397 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Character{
	private String nickname;
	private int level =1;
	private int st=5, dx=5, iq=5, lx=5;
	private int statPoint=0;
	
	Character(String nickname){
		this.nickname=nickname;
	}
	void levelUp() {
		level++;
		statPoint+=5;
	}
	
	void stUP(){
		if(statPoint<=0) {
			System.out.println("스탯포인트 부족");
			return;
		}
		st++;
		statPoint--;
	}
	
	void dxUP(){
		if(statPoint<=0) {
			System.out.println("스탯포인트 부족");
			return;
		}
		dx++;
		statPoint--;
	}
	
	void iqUP(){
		if(statPoint<=0) {
			System.out.println("스탯포인트 부족");
			return;
		}
		iq++;
		statPoint--;
	}
	
	void lxUP(){
		if(statPoint<=0) {
			System.out.println("스탯포인트 부족");
			return;
		}
		lx++;
		statPoint--;
	}
}