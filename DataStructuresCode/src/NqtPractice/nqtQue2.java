package NqtPractice;

import java.util.Iterator;
import java.util.Scanner;

public class nqtQue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int max=0, maxIndex=0;
		for (int i = 0; i < n; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		int sum=0;
		for (int j = 0; j < n; j++) {
			if(j != maxIndex) {
				sum = sum + arr[j];
			}
		}	
		
		if(sum == max) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
