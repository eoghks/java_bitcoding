package example429;

public class TV implements Product, ElectricDevice{

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
		System.out.println("TV ������ �и��ϰ� �����մϴ�.");
	}
	public void use() {
		System.out.println("������ Ƽ�� ���ϴ�.");
	}
}
