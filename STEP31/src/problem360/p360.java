package problem360;


public class p360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodInfo myFood=new FoodInfo(100, "떡볶이", true);
		myFood.goodFoodCheck();
	}

}

class FoodInfo{
	boolean isDelicious=false;
	String foodName;
	int kcal=0;
	boolean isHealthy;
	FoodInfo(int k, String name, boolean delicious){
		this.kcal=k;
		this.foodName=name;
		this.isDelicious=delicious;
		if(k>500)
			this.isHealthy=false;
		else
			this.isHealthy=true;
	}
	void goodFoodCheck() {
		System.out.print(this.foodName+"의 칼로리는 "+kcal+"kcal이고, 건강에 ");
		if(isHealthy)
			System.out.println("좋습니다.");
		else
			System.out.println("좋지않습니다.");
	}
}