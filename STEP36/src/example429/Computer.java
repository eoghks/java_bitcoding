package example429;

public class Computer implements ElectricDevice, Product {
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
	public void use() {
		System.out.println("���ڿ� �ɾ� ��ǻ�͸� �մϴ�.");
	}
}
