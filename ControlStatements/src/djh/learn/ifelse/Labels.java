package djh.learn.ifelse;

public class Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a_label:
			for (int i = 0; i < 34; i++) {
					if( i == 29) {
						continue a_label;
					}
					System.out.println(i);
			}
	}

}
