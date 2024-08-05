package sortingAlgorithm;

import java.util.Scanner;

public class bubble_sort {
	
	//-------------------------------------------
	//------------Bubble Sort--------------------
	//-------------------------------------------
	public static void bubbleSort(int arr[], int n) {
		boolean swap = false;
		for(int j=0 ; j< n-1;j++) {
			swap = false;
			for(int i=0 ; i< n-j-1 ;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swap =true;
				}
			}
			if(swap == false) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("How many elements you want: ");
			int n = scanner.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter Array Element: ");
			for(int i=0;i< n;i++)
				arr[i]=scanner.nextInt();
			System.out.println("----------------------");
			System.out.println("------Bubble Sort-----");
			System.out.println("----------------------");
			
			bubbleSort(arr,n);
			
			System.out.print("Sorted Array:  ");
			for(int i=0;i< n;i++)
				System.out.print(" "+ arr[i]);
		}
	
	}

}
