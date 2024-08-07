//FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:
//
//Coffee
//
//Espresso Coffee
//Cappuccino Coffee
//Latte Coffee
//Tea
//
//Plain Tea
//Assam Tea
//Ginger Tea
//Cardamom Tea
//Masala Tea
//Lemon Tea
//Green Tea
//Organic Darjeeling Tea
//Soups 
//
//Hot and Sour Soup
//Veg Corn Soup
//Tomato Soup
//Spicy Tomato Soup
//Beverages
//
//Hot Chocolate Drink
//Badam Drink
//Badam-Pista Drink

//Write a program to take input for main menu & sub menu and display the name of sub menu selected in the 
//following format (enter the first letter to select main menu):
//
//Welcome to CCD 
//Enjoy your
//Example 1:
//
//Input:
//c
//1
//Output
//Welcome to CCD!
//Enjoy your Espresso Coffee!
//
//Example 2:
//Input:
//t
//9
//Output
//INVALID OUTPUT!

package NqtPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class repeated_que9 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Map<String, LinkedList<String>> menu = new LinkedHashMap<>();
	        menu.put("c", new LinkedList<>(Arrays.asList(
	                "Espresso Coffee",
	                "Cappuccino Coffee",
	                "Latte Coffee"
	        )));
	        menu.put("t", new LinkedList<>(Arrays.asList(
	                "Plain Tea",
	                "Assam Tea",
	                "Ginger Tea",
	                "Cardamom Tea",
	                "Masala Tea",
	                "Lemon Tea",
	                "Green Tea",
	                "Organic Darjeeling Tea"
	        )));
	        menu.put("s", new LinkedList<>(Arrays.asList(
	                "Hot and Sour Soup",
	                "Veg Corn Soup",
	                "Tomato Soup",
	                "Spicy Tomato Soup"
	        )));
	        menu.put("b", new LinkedList<>(Arrays.asList(
	                "Hot Chocolate Drink",
	                "Badam Drink",
	                "Badam-Pista Drink"
	        )));
	        
	        String Menu = scanner.next();
	        int num = scanner.nextInt();
	        
	        if(!menu.containsKey(Menu)) {
	        	System.out.println("INVALID INPUT!!!");
	        	return;
	        }
	        List<String> submenuList = new ArrayList<>(menu.get(Menu));
	        
	        System.out.println("Welcome to CCD");
	        System.out.println("Enjoy your "+submenuList.get(num));
	        
		}
	}	
}
