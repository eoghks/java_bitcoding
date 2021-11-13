package problem381;

public class p381 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Guitar{
	String name;
	int numberOfStrings;//기타줄수
	
	Guitar(String name, int numberOfStrings){
		this.name=name;
		this.numberOfStrings=numberOfStrings;
	}
	
	void play() {
		System.out.println("기타를 연주합니다.");
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
			System.out.println("스피커를 통해 기타 소리가 출력됩니다,");
		else
			System.out.println("스퍼커가 연결되지 않아 소리가 나지 않습니다.");
	}
	
	void connectSpeark() {
		this.speakerConnected=true;
	}
}