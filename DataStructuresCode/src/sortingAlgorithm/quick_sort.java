package sortingAlgorithm;

import java.util.Scanner;

public class quick_sort {
    
    //-------------------------------------------
    //------------Quick Sort--------------------
    //-------------------------------------------
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        int temp;
        
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            
            while (arr[j] > pivot && j > low) {
                j--;
            }
            
            if (i < j) {
                // Swap arr[i] and arr[j]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap pivot with arr[j]
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
    }
    
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("How many elements you want: ");
            int n = scanner.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter Array Element: ");
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            
            System.out.println("----------------------");
            System.out.println("------Quick Sort------");
            System.out.println("----------------------");
            
            quickSort(arr, 0, n - 1);
            
            System.out.print("Sorted Array:");
            for (int i = 0; i < n; i++)
                System.out.print(" " + arr[i]);
        }
    }
}
