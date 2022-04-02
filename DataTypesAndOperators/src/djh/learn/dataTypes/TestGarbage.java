package djh.learn.dataTypes;

public class TestGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.name="Lords of the Rings";
		book = null; //ready for garbage collector
		Book book2 = new Book();
		book2 = book; //ready for garbage collector
		new Book().name="Hobbit";//ready for garbage collector
		
		
	}

}
