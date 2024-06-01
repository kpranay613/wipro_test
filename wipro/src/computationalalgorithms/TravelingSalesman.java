package computationalalgorithms;

import java.util.Arrays;

public class TravelingSalesman {
	
	public static int FindMinCost(int[][] graph) {
		int n = graph.length;
		int[][] dp = new int[n][n];
		
		for(int[] row : dp) {
			Arrays.fill(row, Integer.MAX_VALUE);
		}
		for(int i=1;i<n;i++) {
			dp[i][1] = graph[0][i];
		}
		for(int visited=2;visited<n;visited++) {
			for(int last=0;last<n;last++) {
				for(int prev=0;prev<n;prev++) {
					if(dp[prev][visited -1] != Integer.MAX_VALUE && last != prev) {
						dp[last][visited] = Math.min(dp[last][visited], dp[prev][visited-1]+graph[prev][last]);					
					}
				}
			}
		}
		
		int minCost = Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			minCost = Math.min(minCost, dp[i][n-1]+graph[i][0]);
		}
		return minCost;
	}

	public static void main(String[] args) {
		int[][] graph = {
				{0,10,15,20},
				{10,0,35,25},
				{15,35,0,30},
				{20,25,30,0}};
		System.out.println("Minimum Cost is " + FindMinCost(graph));
	}

}
