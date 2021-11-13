package problem359;

public class p359 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodInfo myFood=new FoodInfo(100, "∂±∫∫¿Ã", true);
	}

}

class FoodInfo{
	boolean isDelicious=false;
	String foodName;
	int kcal=0;
	FoodInfo(int k, String name, boolean delicious){
		this.kcal=k;
		this.foodName=name;
		this.isDelicious=delicious;
	}
}