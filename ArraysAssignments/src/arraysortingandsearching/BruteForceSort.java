package arraysortingandsearching;

import java.util.Arrays;
import java.util.Random;

public class BruteForceSort {
	
	public static int[] initializeArray(int size, int minValue, int maxValue) {
		int[] arr = new int[size];
		Random random = new Random();
		for(int i=0; i<size; i++) {
			arr[i] = random.nextInt((maxValue - minValue)+1);
		}
		return arr;
	}
	
	public static void bruteForceSorting(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = initializeArray(6, 0, 25);
		System.out.println("Original Array : "+ Arrays.toString(arr));
		bruteForceSorting(arr);
		System.out.println("Sorted Array : "+ Arrays.toString(arr));
	}
}
