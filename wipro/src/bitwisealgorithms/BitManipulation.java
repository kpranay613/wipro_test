package bitwisealgorithms;

public class BitManipulation {
	
	public static int countSetBits(int n) {
		int count = 0;
		while(n>0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
	
	public static int totalSetBits(int n) {
		int total = 0;
		for(int i=1; i<=n; i++) {
			total += countSetBits(i);
		}
		return total;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Total number of set bits from 1 to "+ n + " is : "+ totalSetBits(n));
	}

}
