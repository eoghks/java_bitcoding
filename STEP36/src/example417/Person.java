package example417;

public class Person {
	void eatChicken(Object a){
		if(a instanceof BoneyChicken) {
			System.out.println("»À¸¦ ¹ß¶ó ¸Ô½À´Ï´Ù.");
		}
		else if(a instanceof BonelessChicken) {
			System.out.println("Æ÷Å©·Î Âï¾î¸Ô½À´Ï´Ù.");
		}
	}
}
