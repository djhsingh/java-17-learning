package djh.learn.dataTypes;

public class Shifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 12; //1100 
			int j = i>>2;//0011
			System.out.println(Integer.toBinaryString(i) + " right shifting is "+Integer.toBinaryString(j));
			System.out.println(i+" right shifting is "+j);
			System.out.println(" right shifting is "+j);
			int k = i<<2;
			System.out.println(Integer.toBinaryString(i) + " left shifting is "+Integer.toBinaryString(k));
			System.out.println(i+" left shifting is "+k);
			int l = i>>>2;
			System.out.println(Integer.toBinaryString(i) + " unsigned right shifting is "+Integer.toBinaryString(l));
			System.out.println(i+" unsigned right shifting is "+l);
			
	}

}
