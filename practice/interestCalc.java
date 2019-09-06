package practice;

import java.util.Scanner;

public class interestCalc {

	public static void main(String[] args) {
		
		int year, num;
		float interest, prin, holder, converter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter the principle: $");
		prin = sc.nextInt();
		System.out.print("Enter the number of years: ");
		year = sc.nextInt();
		System.out.print("Enter the interest rate(%): ");
		holder = sc.nextFloat();
		System.out.println();
		
		num = 0;
		converter = holder / 100;
		
			while (year > num ) {
			
				interest = prin * converter;
				prin = prin + interest;
				num += 1;
				
		}
		
		System.out.printf("After " + year + " years, you have $%1.2f", prin);
		System.out.println();
		System.out.println();
		
	}

}