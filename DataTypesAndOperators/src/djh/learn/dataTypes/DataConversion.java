package djh.learn.dataTypes;

public class DataConversion {
	
	public static void main(String[] args) {
		//converting from small dt to large is wideneing//implicit
		int num = 45434;
		long ln = num;
		System.out.println(ln);
		////converting from large dt to small is narrowing//explicit
		byte bt = (byte)num;
		System.out.println(bt);
	}
}
