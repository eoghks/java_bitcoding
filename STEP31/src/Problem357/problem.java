package Problem357;

public class problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book myBook = new Book("BitCoding", 200);
		Book yourBook = new Book("Harry Potter", 500);
		System.out.println(myBook.bookName);
		System.out.println(myBook.page<yourBook.page);
	}

}

class Book{
	String bookName;
	int page;
	
	Book(String name, int page){
		this.page =page;
		this.bookName=name;
	}
}
