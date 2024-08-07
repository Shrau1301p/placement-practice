//Chain Marketing Organization has has a scheme for income generation, through which its members generate income for themselves. 
//The scheme is such that suppose A joins the scheme and makes R and V to join this scheme  then A is Parent Member of R and V who are child Members. 
//When any member joins the scheme then the parent gets total commission of 10% from each of its child members.
//Child members receive commission of 5% respectively. If a Parent member does not have any member joined under him, then he gets commission of 5%.
//Take name of the members joining the scheme as input.
//Display how many members joined the scheme including parent member.
//Calculate the Total commission gained by each members in the scheme. 
//The fixed amount for joining the scheme is Rs.5000 on which commission will be generated
//SchemeAmount = 5000
//
//Example 1: When there are more than one child members 
//Input : (Do not give input prompts.Accept values as follows. )
//Amit                     //Enter parent Member as this
//Y                           //Enter Y if  Parent member has child members otherwise enter N
//Rajesh,Virat        //Enter names of child members of Amit in comma separated
//Output:(Final Output must be in format given below.)
//TOTAL MEMBERS:3
//COMISSION DETAILS
//Amit: 1000 INR
//Rajesh :250 INR
//Virat: 250 INR
//
//Example 2: When there is only one child member in the hierarchy
//Input :
//Amit
//Y
//Rajesh
//Output:
//Total Members: 2 
//Comission Details
//Amit: 500 INR
//Rajesh: 250 INR

package NqtPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class repeated_que8 {
	
	static final double SCHEME_AMOUNT = 5000;
    static final double PARENT_COMMISSION_RATE = 0.10;
    static final double CHILD_COMMISSION_RATE = 0.05;
    static final double NO_CHILD_COMMISSION_RATE = 0.05;
	
    public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String parent = scanner.nextLine();
			
			String choice = scanner.nextLine();
			
			ArrayList<String> childs = new ArrayList<>();
			HashMap<String, Double> comissions = new HashMap<>();
			
			if(choice.equals("Y")) {
				String childString = scanner.nextLine();
				String[] childMember = childString.split(",");
				Double parentComission = 0.0; 
				for (String child : childMember) {
					childs.add(child.trim());
					Double comissionDouble = SCHEME_AMOUNT*CHILD_COMMISSION_RATE;
					comissions.put(child, comissionDouble);
					parentComission += SCHEME_AMOUNT*PARENT_COMMISSION_RATE;
				}
				childs.add(parent);
				comissions.put(parent, parentComission);
				System.out.println("Totals Members: "+ childs.size());
				System.out.println("Comission Details");
				System.out.println(parent +" : " +parentComission+" INR");
				for (String child : childMember) {
					System.out.println(child +" : " +comissions.get(child)+" INR");
				}
			} else {
				System.out.println("Totals Members: 1");
				System.out.println("Comission Details");
				System.out.println(parent +" : "+ SCHEME_AMOUNT*NO_CHILD_COMMISSION_RATE);
			}
		}
	}

}













