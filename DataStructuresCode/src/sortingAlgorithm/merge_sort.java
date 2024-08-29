package sortingAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class merge_sort {
	
	//-------------------------------------------
	//------------Merge Sort--------------------
	//-------------------------------------------
	public static void merge(int arr[], int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr
     
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++; 
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
	}
	
	public static void mergeSort(int arr[], int low,  int high) {
		if (low >= high) return;
		int mid = (low + high)/2;
		mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
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
			System.out.println("------Merge Sort------");
			System.out.println("----------------------");
			
			mergeSort(arr,0,n-1);
			
			System.out.print("Sorted Array:");
			for(int i=0;i< n;i++)
				System.out.print(" "+ arr[i]);
		}
	}

}
