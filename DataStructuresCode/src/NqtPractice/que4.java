//Airport security officials have confiscated several item of the passengers at the security check point. 
//All the items have been dumped into a huge box (array). 
//Each item possesses a certain amount of risk[0,1,2]. 
//Here, the risk severity of the items represent an array[] of N number of integer values. 
//The task here is to sort the items based on their levels of risk in the array. 
//The risk values range from 0 to 2.
//
//Example :
//
//Input :
//
//7  -> Value of N
//
//[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.
//
//Output :
//
//0 0 0 1 1 2 2  -> Element after sorting based on risk severity 
//
//Example 2:
//
//input : 10  -> Value of N 
//
//[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.
//
//Output : 
//
//0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.
//
//Explanation:
//
//In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. 
//The output is a sorted array from 0 to 2 based on risk severity.


package NqtPractice;

import java.util.Scanner;

public class que4 {
	public static void main(String[] args) {
		boolean swap;
		Scanner sc = new Scanner(System.in);
		System.out.println("Array Length Should be:");
		int n=sc.nextInt();
		System.out.println("Enter Array Element:");
		int arr[]=new int[n];
		for(int i=0;i< n;i++)
			arr[i]=sc.nextInt();

		//-------------------------------------------
		//------------Bubble Sort--------------------
		//-------------------------------------------

//		for(int j=0 ; j< n-1;j++) {
//			swap = false;
//			for(int i=0 ; i< n-j-1 ;i++) {
//				if(arr[i] > arr[i+1]) {
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//					swap =true;
//				}
//			}
//			if(swap == false) {
//				break;
//			}
//		}
		
		//-------------------------------------------
		//------------quick Sort--------------------
		//-------------------------------------------

		
		
		System.out.println("After applying logic Array is:");
		for(int x=0;x<n;x++)
		  System.out.print(" " + arr[x]);
	}
}
