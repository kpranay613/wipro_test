package arraysortingandsearching;

public class LinearSearch {
	
	public static int performLinearSearch(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 9, 2, 4, 8, 3, 1, 7, 6};
		int target = 3;
		
		int index = performLinearSearch(arr,target);
		if(index != -1) {
			System.out.println("Element " + target + " found at index: "+ index);
		}
		else {
			System.out.println("Element "+ target + " not found");
		}
	}
}
