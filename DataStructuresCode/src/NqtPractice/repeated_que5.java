//We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. 
//and exterior wall painting cost is Rs.12 per sq.ft.
//
//Take input as
//1. Number of Interior walls
//2. Number of Exterior walls
//3. Surface Area of each Interior 4. Wall in units of square feet
//Surface Area of each Exterior Wall in units of square feet
//
//If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.
//
//Calculate and display the total cost of painting the property
//Example 1:
//6
//3
//12.3
//15.2
//12.3
//15.2
//12.3
//15.2
//10.10
//10.10
//10.00
//Total estimated Cost : 1847.4 INR
//Note: Follow in input and output format as given in above example

package NqtPractice;

import java.util.Scanner;

public class repeated_que5 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			float temp=0;
			float totalDouble=0;

			System.out.println("Number of Interior Wall: ");
			int interior = scanner.nextInt();
			
			System.out.println("Number of Exterior Wall: ");
			int exterior = scanner.nextInt();
			
			System.out.println("Enter Interior Surface Area: ");
			for (int i = 0; i < interior; i++) {
				temp = scanner.nextFloat();
				totalDouble += temp*18;
			}
			
			System.out.println("Enter Exterior Surface Area: ");
			for (int i = 0; i < exterior; i++) {
				temp = scanner.nextFloat();
				totalDouble += temp*12;
			}
			
			System.out.println("Total estimated Cost: "+totalDouble);
		}
	}

}
