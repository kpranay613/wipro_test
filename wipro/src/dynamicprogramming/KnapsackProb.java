package dynamicprogramming;

public class KnapsackProb {
	public static int knapsack(int W, int[] weights, int[] values) {
		int n = weights.length;
		int[] dp = new int[W+1];
		
		for(int i=0;i<n;i++) {
			for(int w=W;w>=weights[i];w--) {
				dp[w] = Math.max(dp[w], dp[w-weights[i]]+values[i]);
			}
		}
		return dp[W];
	}
	
	public static void main(String[] args) {
		int W=50;
		int[] weights = {10,20,30};
		int[] values = {60,100,120};
		System.out.println("Maximum in knapsack :"+ knapsack(W, weights, values));
	}
}
