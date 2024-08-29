//A chocolate factory is packing chocolates into the packets. 
//The chocolate packets here represent an array  of N number of integer values. 
//The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
//
//Example 1 :
//N=8 and arr = [4,5,0,1,9,0,5,0].
//There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

//Input :
//8  – Value of N
//[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

//Output:
//4 5 1 9 5 0 0 0

package NqtPractice;

import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
//			System.out.println("Array Length Should be:");
//			int n=sc.nextInt();
//			System.out.println("Enter Array Element:");
//			int arr[]=new int[n];
//			for(int i=0;i< n;i++)
//			      arr[i]=sc.nextInt();
		int n=8;
		int arr[] = {4,5,0,1,9,0,5,0}; 
//        
			for(int i=0;i<n;i++) {
				if(arr[i] == 0) {
					for(int j=i; j<n;j++) {
						if(arr[j] == 0 && j+1<n) {
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
						}
					}
				}
			}
			System.out.println("After applying logic Array is:");
			for(int x=0;x<n;x++)
			  System.out.print(" " + arr[x]);
		}
	}
}
