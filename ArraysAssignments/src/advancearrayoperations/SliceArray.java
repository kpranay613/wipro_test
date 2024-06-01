package advancearrayoperations;

import java.util.Arrays;

public class SliceArray {
	
	public static int[] sliceArray(int[] arr, int startIn, int endIn) {
		int sliceArrLength = endIn - startIn + 1;
		int[] sliceArr = new int[sliceArrLength]; 
		for(int i=0; i<sliceArrLength; i++) {
			sliceArr[i] = arr[startIn + i];
		}
		return sliceArr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 9, 2, 4, 8, 3, 1, 7, 6};
		int startIn = 1;
		int endIn = 5;
		
		int[] slicedArr = sliceArray(arr,startIn,endIn);
		System.out.println("SliceArray is: " + Arrays.toString(slicedArr));
	}
}
