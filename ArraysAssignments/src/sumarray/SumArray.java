package sumarray;

public class SumArray {
	
	public static int sumArray(int[] arr, int n) {
		if(n==1) {
			return arr[0];
		}
		return arr[n-1] + sumArray(arr, n-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 9, 2, 3, 1, 7, 6};
		int sum = sumArray(arr,arr.length);
		System.out.println("Sum of array elements: " + sum);
	}
}
