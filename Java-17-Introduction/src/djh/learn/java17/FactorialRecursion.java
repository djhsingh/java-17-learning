package djh.learn.java17;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = fact(5);
		System.out.println("Factorial is "+result);
	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		if(i == 0 || i==1) {
			return 1;
		}
		return i*fact(i-1);
	}

}
