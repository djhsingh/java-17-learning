package djh.learn.ifelse;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 0,p=0,c=1,k=0;
			System.out.println(p);
			System.out.println(c);
			while(i<5) {
				k=p+c;
				System.out.println(k);
				p=c;
				c=k;
				i++;
			}
			
	}

}
