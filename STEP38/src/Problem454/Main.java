package Problem454;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("A", 25);
		Person p2= new Person("B", 18);
		AlcoholBar bar= new AlcoholBar("흑맥주");
		try{
			bar.sellAlcohol(p2);
		}catch(IllegalAgeException e){
			System.out.println("19세 미만 주류판매금지");
			e.getStackTrace();
		}
		try{
			bar.sellAlcohol(p1);
		}catch(IllegalAgeException e){
			System.out.println("19세 미만 주류판매금지");
			e.getStackTrace();
		}
	}

}
