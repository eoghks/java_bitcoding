package example414;
import example413.TV;
public class e414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TV2 implements TV{
	private boolean power=false;
	private int channel;
	public void channelUP() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
	public void powerOnOff() {
		if(power)
			power=false;
		else
			power=true;
	}
	public int getCurrentChannel() {
		return channel;
	}
	public void goToChannel(int ch) {
		this.channel=ch;
	}
}