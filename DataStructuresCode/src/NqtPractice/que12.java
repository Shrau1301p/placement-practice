//Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. 
//The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. 
//The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
//Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.
//
//(*>#): positive integer
//(#>*): negative integer
//(#=*): 0
//Example 1:
//Input 1:
//
//###***   -> Value of S
//Output :
//
//0   → number of * and # are equal

package NqtPractice;

import java.util.Scanner;

public class que12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String pattern=sc.next();
		int hashCount=0, asterisk=0;
		for (int i = 0; i < pattern.length(); i++) {
//			System.out.println(pattern.charAt(i));
			if(pattern.charAt(i) == '#') {
				hashCount++;
			} else if(pattern.charAt(i) == '*') {
				asterisk++;
			} else {
				System.out.println("Invalid Input");
				return;
			}
		}
		if(hashCount == asterisk) {
			System.out.println(0 + " → number of * and # are equal");
		} else if(hashCount > asterisk){
			System.out.println( asterisk +" → number of * and # are equal");
		} else {
			System.out.println(hashCount +" → number of * and # are equal");
		}
		
	}
}
