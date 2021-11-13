package example371;

public class e371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolceCream a= new ChocolceCream();
		a.name = "My Icecream";
		a.myTaste();
		a.ParentTaste();
	}

}

class IceCream{
	String name;
	String taste = "sweet";
}

class ChocolceCream extends IceCream{
	String taste = "chocolate";
	void myTaste() {
		System.out.println(this.taste);
	}
	
	void ParentTaste() {
		System.out.println(super.taste);
	}
}
