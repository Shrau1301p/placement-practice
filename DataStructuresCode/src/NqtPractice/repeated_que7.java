//There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts, 
//the Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. 
//If total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on 
//the Tree after some of them jumped down to eat.
//At a time one Monkeys gets down and finishes eating and go to the other side of the road. 
//The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
//Monkey can either eat k Bananas or j Peanuts. 
//If for last Monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, 
//only that Monkey can eat Bananas(<k) along with the Peanuts(<j).
//Write code to take inputs as n, m, p, k, j and return  the number of Monkeys left on the Tree.
//    Where, n= Total no of Monkeys
//        k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
//        j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
//        m = Total number of Bananas
//        p  = Total number of Peanuts
//Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero
//
//Example 1:
//Input Values    
//20
//2
//3
//12
//12
//
//Output Values
//Number of  Monkeys left on the tree:10
//Note: Kindly follow  the order of inputs as n,k,j,m,p as given in the above example. 
//And output must include  the same format  as in above example(Number of Monkeys left on the Tree:)
//For any wrong input display INVALID INPUT

package NqtPractice;

import java.util.Scanner;

public class repeated_que7 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Number of Monkeys on tree: ");
			int n = scanner.nextInt();
			System.out.println("Number of Bananas single monkey: ");
			int k = scanner.nextInt();
			System.out.println("Number of Peanuts single monkey: ");
			int j = scanner.nextInt();
			System.out.println("Number of Bananas: ");
			int m = scanner.nextInt();
			System.out.println("Number of Peanuts: ");
			int p = scanner.nextInt();
			if(m==0 && p==0 || j==0 || k==0) {
				System.out.println("Invalid Input");
				return;
			}	
			int monkeys = n - (p/k + p/j);
			System.out.println("Number of  Monkeys left on the tree: "+monkeys);
    	}	
	}

}
