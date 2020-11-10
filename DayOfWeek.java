package com.demo.first;

import java.util.Scanner;

public class DayOfTheWeek1 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		int dayOfWeek = Integer.parseInt(scanner.nextLine());
		String day = "";
				
				switch(dayOfWeek) {
				
				case 1:
					day = "Monday";break;
				case 2:
					day ="Tuesday";break;
				case 3:
					day = "Wednesday";break;
				case 4:
					day = "Thursday";break;
				case 5:
					day = "Friday";break;
				case 6:
					day = "Saturday";break;
				case 7:
					day = "Sunday";break;
					default:
						day = "";break;
		           
				}
				scanner.close();
				
				System.out.printf("You entered %d. So week day is %s." , dayOfWeek, day);
	}

}
