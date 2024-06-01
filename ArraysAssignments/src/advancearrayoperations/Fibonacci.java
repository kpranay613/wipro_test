package advancearrayoperations;

import java.util.Arrays;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void fibonacciArray(int[] arr, int n, int index) {
		if(n<=0) {
			return;
		}
		arr[index] = fibonacci(index);
		fibonacciArray(arr, n-1, index+1);
	}
	public static void main(String[] args) {
		int n =13;
		int[] arr = new int[n];
		fibonacciArray(arr,n,0);
		System.out.println("Fibonacci Sequence: "+ Arrays.toString(arr));
		int nthEle = arr[n-1];
		System.out.println(n+"th Fibonacci number is: "+ nthEle);
	}
}
