//A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different 
//groups of patients depending on their age. If the patient’s age is below 17, fees is 200 INR. 
//If the patient’s age is between 17 and 40, fees is 400 INR. 
//If patient’s age is above 40, fees is 300 INR. 
//Write a code to calculate earnings in a day for which one array/List of values representing age of patients visited on that day is passed as input.
//Note:
//
//Age should not be zero or less than zero or above 120
//Doctor consults a maximum of 20 patients a day
//Enter age value (press Enter without a value to stop):
//Example 1:
//Input
//20
//30
//40
//50
//2
//3
//14
//Output
//Total Income 2000 INR
//Note: Input and Output Format should be same as given in the above example.
//For any wrong input display INVALID INPUT
//Output Format
//Total Income 2100 INR

package NqtPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class repeated_queTen {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			ArrayList<Integer> ages = new ArrayList<>();
			
			System.out.println("Enter Age Value: ");
			
			while (ages.size() >20) {				
				String age = scanner.nextLine().trim();
				if (age.isEmpty()) {
					break;
				}
				ages.add(Integer.parseInt(age));
			}
			
			int totalSum = 0;
			
			for (Integer age1 : ages) {
				if(age1 < 17) {
					totalSum += 200;
				} else if(age1 >= 17 && age1<= 40) {
					totalSum += 400;
				} else if(age1 > 40 && age1 < 120) {
					totalSum += 300;
				} else {
					System.out.println("INVALID AGE");
				}
			}
			
			System.out.println("Total Income: "+totalSum+" INR");
		}
	}

}
