package djh.learn.ifelse;

import java.util.Scanner;

public class IfElse {
		public static void main(String[] args) {
			
			boolean bl = true;
			if(bl) {
				System.out.println("Value is True");
			} else {
				System.out.println("Value is False");
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			if(num % 2 == 0) {
				System.out.println("Number is Even");
			} else {
				System.out.println("Number is Odd");
			}
			
			
			int x =5,y=4,z=9;
			
			if(x>y && y > z) {
				System.out.println("x is greater");
			} else if(y>x && y >z) {
				System.out.println("Y is grater");
			} else	{
				System.out.println("Z is Greater");
			}
		}
}
