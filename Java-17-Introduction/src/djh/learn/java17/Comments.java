package djh.learn.java17;

/**
 * java doc comments
 * @author Sunil Jangra
 *
 */
public class Comments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//single line comment
		System.out.println("comments");
		//int x = 45;
		int sum = add(4,5);
		System.out.println(sum);
	}
	
	/**
	 * 
	 * @param interger i
	 * @param integer j
	 * @return sum of two numbers
	 */
	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return (i+j);
	}

}
