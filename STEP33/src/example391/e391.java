package example391;

public class e391 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGame mg= new MyGame("��Ʈ�ڵ�");
		mg.findStar();
		mg.findStar();
		mg.finishStarQuest();
		mg.findStar();
		mg.finishStarQuest();
		mg.finishStarQuest();
	}

}

class MyGame{
	private String characterName;
	private int gameMoney =1000;
	private int star=0;
	MyGame(String name){
		this.characterName=name;
	}
	
	public void findStar() {
		star++;
	}
	
	public void finishStarQuest() {
		if(this.star>=3) {
			this.gameMoney+=5000;
			System.out.println("5000���ӸӴ� ���ݿϷ�");
			this.star=0;
		}
		else {
			System.out.println("���� ���� �����մϴ�.");
		}
	}
}