package practice;

import java.util.Scanner;

public class fToC {

	public static void main(String[] args) {
			
		double far, cel, holder;
		String input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Do you want to convert F or C ?: ");
		input = sc.nextLine().toLowerCase();
		
			if (input.contentEquals("f")) {
				
				System.out.println();
				System.out.print("Enter a tempurature to convert to celcius: ");
				far = sc.nextDouble();
				cel = ((far - 32) * 5/9);
				System.out.printf("That's %1.2f degrees celcius!", cel);
				System.out.println();
				System.out.println();
				holder = cel;
				
				if (holder > 32) {
						
						System.out.println("Beware of heat exhaustion!");
						System.out.println();
						
					} else if (holder <= 0) {
						
						System.out.println("Beware of hypothermia!");
						System.out.println();
						
					}
				
			} else {
				
				System.out.println();
				System.out.print("Enter a tempurature to convert to fahrenheit: ");
				cel = sc.nextDouble();
				far = ((cel * 9/5) + 32);
				System.out.printf("That's %1.2f degrees fahrenheit!", far);
				System.out.println();
				System.out.println();
				holder = far;
				
					if (holder >= 90) {
						
						System.out.println("Beware of heat exhaustion!");
						System.out.println();
						
					} else if (holder <= 32) {
						
						System.out.println("Beware of hypothermia!");
						System.out.println();
						
					}
			}
		
			
	}

}
