package example428;

public class Computer implements ElectricDevice {
	private boolean power=false;
	public void internet() {
		System.out.println("인터넷 접속");
	}
	
	public void pwerOnOff() {
		if(power)
			power=false;
		else
			power=true;
	}
	public void fixDevice() {
		System.out.println("컴퓨터 본체를 분해하고 수리합니다.");
	}
}
