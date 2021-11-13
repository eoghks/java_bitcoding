package problem365;

public class p365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesHistory c1=new SalesHistory(100);
		SalesHistory c2=new SalesHistory(100, "Á¤Çö", 'M', 25);
		
	}

}

class SalesHistory{
	String custName=null;
	char gender='?';
	int price;
	int custAge=-1;
	
	SalesHistory(int p){
		this.price=p;
	}
	SalesHistory(int p, String name, char gen, int age){
		this.price=p;
		this.custAge=age;
		this.gender=gen;
		this.custName=name;
	}
	
}
