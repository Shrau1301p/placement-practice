//An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
//
//1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
//2nd data, Total number of wheels = W
//The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
//Example :
//
//Input :
//200  -> Value of V
//540   -> Value of W
//
//Output :
//TW =130 FW=70
//
//Explanation:
//130+70 = 200 vehicles
//(70*4)+(130*2)= 540 wheels
//
//Constraints :
//
//2<=W
//W%2=0
//V<W
//Print “INVALID INPUT” , if inputs did not meet the constraints.
//
//The input format for testing 
//The candidate has to write the code to accept two positive numbers separated by a new line.
//
//First Input line – Accept value of V.
//Second Input line- Accept value for W.
//The output format for testing 
//
//Written program code should generate two outputs, each separated by a single space character(see the example)
//Additional messages in the output will result in the failure of test case

package NqtPractice;

import java.util.Scanner;

public class que11 {

	public static void main(String[] args) {
//		TW+FW=V 
//		2×TW+4×FW=W
//		FW = (W - (2 * v)) / 2
//		TW = v - fw
		//We ensure that 
//		W is at least 
//		2×𝑉
//		2×V (since each vehicle has at least 2 wheels).
//		We check if 
//		(𝑊−2×𝑉)
//		(W−2×V) is even (as the number of four-wheelers must be an integer).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter V value: ");
		int v=sc.nextInt();
		System.out.println("Enter W value: ");
		int W=sc.nextInt();
		
		if(W >= 2 * v && (W - 2 * v) % 2 == 0) {
			int fourWheelers = (W - (2*v))/2;
			int twoWheelers = v - fourWheelers;	
			System.out.println("Four Wheelers: "+fourWheelers);
			System.out.println("Two Wheelers: "+twoWheelers);
		}
	}

}
