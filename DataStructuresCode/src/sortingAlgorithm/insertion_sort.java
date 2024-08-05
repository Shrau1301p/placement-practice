package sortingAlgorithm;

import java.util.Scanner;

public class insertion_sort {
	
	//-------------------------------------------
	//------------Insertion Sort--------------------
	//-------------------------------------------
	public static void insertionSort(int arr[], int n) {
		for(int i=0 ; i<n;i++) {
			int value = arr[i];
			int hole = i-1;
			while(hole >= 0 && arr[hole]>value) {
				arr[hole+1] = arr[hole];
				hole--;
			}
			arr[hole+1] = value;
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
			System.out.println("----Insertion Sort----");
			System.out.println("----------------------");
			
			insertionSort(arr,n);
			
			System.out.print("Sorted Array:");
			for(int i=0;i< n;i++)
				System.out.print(" "+ arr[i]);
		}
	
	}

}
