package example417;

public class Person {
	void eatChicken(Object a){
		if(a instanceof BoneyChicken) {
			System.out.println("���� �߶� �Խ��ϴ�.");
		}
		else if(a instanceof BonelessChicken) {
			System.out.println("��ũ�� ���Խ��ϴ�.");
		}
	}
}
