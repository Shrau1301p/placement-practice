package linearDataStructure;
import java.util.*; 

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Simple array working in java
		int[] arr = {1,2,3,4,5};
		//System.out.println(arr[0]);
		
		System.out.println("Printing Number array list");
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		String[] arr1 = {"a","b","c","d","e"};
		System.out.println("Printing String array list");
		for(int i=0; i<arr1.length ; i++) {
			System.out.print(arr1[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		//2-D array working in java
		int[][] TwoDimentionalArr= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(dynamicArr[0][0]);
		
		//Printing TwoDimentionalArr 
		for(int i=0; i< TwoDimentionalArr.length; i++) {
			for(int j=0; j< TwoDimentionalArr.length; j++) {
				System.out.print(TwoDimentionalArr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//ArrayList collection
		ArrayList<String> dynamicArr = new ArrayList<String>();
		
		dynamicArr.add("Shravani");
		dynamicArr.add("Sumit");
		dynamicArr.add("Prathamesh");
		dynamicArr.add("Atharv");
		dynamicArr.add("Aarti");
		dynamicArr.add("Aruna");
		
		System.out.println("Dynamic Array of string");
		System.out.println(dynamicArr);
		System.out.println("Size of dynamic array " + dynamicArr.size());

		System.out.println();
		dynamicArr.remove(5);
		System.out.println("Dynamic Array After removing last entry");
		System.out.println(dynamicArr);
		System.out.println("Size of dynamic array " + dynamicArr.size());
		
		System.out.println();
		System.out.println("Dynamic Array using get method");
		for (int i = 0; i < dynamicArr.size(); i++) {
		      System.out.print(dynamicArr.get(i));
		      System.out.print("  ");
		}
		
		System.out.println();
		
		ArrayList<Integer> dynamicArr1 = new ArrayList<Integer>();
		dynamicArr1.add(1);
		dynamicArr1.add(2);
		dynamicArr1.add(3);
		dynamicArr1.add(4);
		dynamicArr1.add(5);
		
		System.out.println();
		System.out.println("Dynamic Array of numbers");
		System.out.println(dynamicArr1);
		System.out.println("Size of dynamic array " + dynamicArr1.size());

}
