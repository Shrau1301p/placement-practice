package sortingAlgorithm;

import java.util.Scanner;

public class selection_sort {
	
	//-------------------------------------------
	//------------selection Sort--------------------
	//-------------------------------------------
	public static void selectionSort(int arr[], int n) {
		for(int i=0 ;i<n;i++) {
			int min_pos= i;
			for(int j=i ;j<n;j++) {
				if(arr[j] < arr[min_pos]) {
					min_pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_pos];
			arr[min_pos] = temp;
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
			System.out.println("----Selection Sort----");
			System.out.println("----------------------");
			
			selectionSort(arr,n);
			
			System.out.print("Sorted Array:");
			for(int i=0;i< n;i++)
				System.out.print(" "+ arr[i]);
		}
	}

}
