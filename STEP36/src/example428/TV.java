package example428;

public class TV {

	private boolean power= false;
	private int channel;
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void powerOnOff() {
		if(power)
			power =false;
		else
			power =true;
	}
	public void fixDevice() {
		System.out.println("TV 뒷판을 분리하고 수리합니다.");
	}
}
