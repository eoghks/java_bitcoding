package example428;

public class Computer implements ElectricDevice {
	private boolean power=false;
	public void internet() {
		System.out.println("���ͳ� ����");
	}
	
	public void pwerOnOff() {
		if(power)
			power=false;
		else
			power=true;
	}
	public void fixDevice() {
		System.out.println("��ǻ�� ��ü�� �����ϰ� �����մϴ�.");
	}
}
