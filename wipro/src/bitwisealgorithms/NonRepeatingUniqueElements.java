package bitwisealgorithms;

public class NonRepeatingUniqueElements {
		
	public static int[] findUniqueEle(int[] nums) {
		int xor =0;
		for(int num : nums) {
			xor ^= num;
		}
		int setBit = xor & -xor;
		
		int x=0, y=0;
		for(int num : nums) {
			if((num & setBit) == 0) {
				x ^= num;
			}
			else {
				y ^= num;
			}
		}
		return new int[] {x,y};
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,2,1,4,3,0};
		int[] result = findUniqueEle(nums);
		System.out.println("Non repeating elements are "+ result[0] + " and "+ result[1]);
	}
}
