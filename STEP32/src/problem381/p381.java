package problem381;

public class p381 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Guitar{
	String name;
	int numberOfStrings;//��Ÿ�ټ�
	
	Guitar(String name, int numberOfStrings){
		this.name=name;
		this.numberOfStrings=numberOfStrings;
	}
	
	void play() {
		System.out.println("��Ÿ�� �����մϴ�.");
	}
}

class ElectricGuitar extends Guitar{
	boolean speakerConnected=false;
	ElectricGuitar(String name, int numberOfStrings){
		super(name, numberOfStrings);
	}
	
	void play() {
		super.play();
		if(speakerConnected)
			System.out.println("����Ŀ�� ���� ��Ÿ �Ҹ��� ��µ˴ϴ�,");
		else
			System.out.println("����Ŀ�� ������� �ʾ� �Ҹ��� ���� �ʽ��ϴ�.");
	}
	
	void connectSpeark() {
		this.speakerConnected=true;
	}
}