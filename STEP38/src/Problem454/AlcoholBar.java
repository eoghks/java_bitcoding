package Problem454;

public class AlcoholBar {
	String todaysAlcohol;
	AlcoholBar(String a){
		this.todaysAlcohol=a;
	}
	public void sellAlcohol(Person p) throws IllegalAgeException {
		if(p.age<19) {
			throw new IllegalAgeException();
		}
		else {
			System.out.printf("%s���� %s �Ǹ� �Ϸ�", p.name, this.todaysAlcohol);
			p.myAlcohol=this.todaysAlcohol;
		}
	}

}
