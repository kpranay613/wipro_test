package twosumproblem;

import java.util.Arrays;

public class TwoSumProblem {
	public static void main(String[] args) {
		int[] arr = {5, 9, 2, 4, 8, 3, 1, 7, 6};
		int target = 16;
		boolean isFound = false;
		Arrays.sort(arr);
		int l = 0;
		int h = arr.length -1;
		while(l < h) {
			if(arr[l] + arr[h] == target) {
				isFound = true;
				break;
			}
			else if(arr[l] + arr[h] < target) {
				l++;
			}
			else {
				h--;
			}
		}
		if(isFound) {
			System.out.println("Sum of "+ arr[l] + " and " + arr[h] + " = "+ target);
		}
		else {
			System.out.println("Elements not found");
		}
		
		
	}
}
