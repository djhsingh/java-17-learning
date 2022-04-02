package djh.learn.ifelse;

import java.util.Scanner;

public class SwitchSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Character......");
			char c  = sc.nextLine().charAt(0);
			switch(c) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :  
				System.out.println("Vowle");
				break;
			default:
				System.out.println("Consonent");
				
			}
			
			
			
			///
			System.out.println("Latest switch....");
			
			String month = "FEB";
			int year = 2022;
			int ndays = switch(month) {
			case "JAN", "MAR", "May", "JULY", "AUG", "OCT", "DEC" -> 31;
			case "APR", "JUN", "SEPT", "NOV" -> 30;
			case "FEB" -> {
				if(year % 400 == 0) yield 29;
				else if(year % 100 == 0) yield 28;
				else if(year % 4 == 0) yield 29;
				else yield 28;
			}
			default ->  30;
			};
			System.out.println(ndays);
	}

}
